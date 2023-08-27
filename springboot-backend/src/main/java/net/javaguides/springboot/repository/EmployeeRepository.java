package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}

//passing Employee JPA entity and type of the primary key 
//in public interface EmployeeRepository extends JpaRepository<Employee,Long>

//@Repository Annotation is a specialization of @Component annotation which is used to indicate 
//that the class provides the mechanism for storage, retrieval, update, delete and search operation 
//on objects

//Jpa Repository has many methods to do operations on database.
//So we dont need to create a service layer since the methods we need to do operations on
//database is present in JPA repository.

//service layer will have all the methods.
//In case if we need some additional methods then we need to create a service layer where its
// business logic will be present
// A Service Layer defines an application's boundary and it contains a  set of available operations 
//from the perspective of interfacing client layers.