package com.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<StudentException> handelException(Exception exc){
		StudentException response=new StudentException();
		
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		response.setMessage(exc.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		response.setErrorCode("Not_Found");
		
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		
	}
	
}