package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//The @Entity annotation specifies that the class is an entity and is mapped to a database table. 
//The @Table annotation specifies the name of the database table to be used for mapping.

@Entity
@Table(name="employees")
public class Employee {
	
//The @Id annotation specifies the primary key of an entity and 
//the @GeneratedValue provides for the specification of generation strategies for the values 
//of primary keys.
//@GeneratedValue will increment the id on its own.we dont need to take care of it.
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email_id")
	private String emailId;
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}


//In a Object Relational Mapping context, every object needs to have a unique identifier. 
//You use the @Id annotation to specify the primary key of an entity.
//
//The @GeneratedValue annotation is used to specify how the primary key should be generated. 
//In your example you are using an Identity




