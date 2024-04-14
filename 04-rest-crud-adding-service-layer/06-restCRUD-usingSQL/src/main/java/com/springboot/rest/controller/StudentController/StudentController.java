package com.springboot.rest.controller.StudentController;


import com.springboot.rest.DAO.implementation.StudentDAOimpls;
import com.springboot.rest.entity.StudentEntity;
import com.springboot.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<StudentEntity> getStudent(){
        return studentService.fetchAllStudent();
    }
}
