package com.springboot.restCRUD.StudentRestController.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//this class will handle all global exception for student

@ControllerAdvice
public class StudentExceptionHandler {


    //Adding an exception handler


    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (StudentNotFoundException exc){

        //Create studentErrorResponse
        StudentErrorResponse s1=new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(), System.currentTimeMillis());
        //return Response Entity
        return new ResponseEntity<>(s1,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException (Exception exc){

        //Create studentErrorResponse
        StudentErrorResponse s1=new StudentErrorResponse(HttpStatus.NO_CONTENT.value(), exc.getMessage(), System.currentTimeMillis());
        //return Response Entity
        return new ResponseEntity<>(s1,HttpStatus.NOT_FOUND);
    }


////    or we can simply do
//@ExceptionHandler(StudentNotFoundException.class)
//public StudentErrorResponse handleException (StudentNotFoundException exc){
//
//    StudentErrorResponse s1=new StudentErrorResponse(HttpStatus.NOT_FOUND.value(), exc.getMessage(), System.currentTimeMillis());
//    return s1;
//}


}
