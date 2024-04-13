package com.springboot.rest.controller.StudentController;


import com.springboot.rest.DAO.implementation.StudentDAOimpls;
import com.springboot.rest.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

private StudentDAOimpls studentDAOimpls;

    @Autowired
    public StudentController(StudentDAOimpls studentDAOimpls) {
        this.studentDAOimpls = studentDAOimpls;
    }


    @GetMapping("/students")
    public List<StudentEntity> getStudent(){
        return studentDAOimpls.fetchAllStudent();
    }
}
