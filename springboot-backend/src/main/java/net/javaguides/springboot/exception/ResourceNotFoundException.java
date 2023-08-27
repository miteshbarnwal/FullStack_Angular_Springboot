package net.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID= 1L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
// whenever a resource is not found in the database,we can throw this exception
// we are passing the message to the super class
// we are using the value property to HttpStatus.NOT_FOUND.
//Whenever a record is not found in the database then Rest Api will throw this exception
// Api will return a not found status to the client if the record is not found in the database
