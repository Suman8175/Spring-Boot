package com.springboot.rest.service;

import com.springboot.rest.DAO.StudentDAO;
import com.springboot.rest.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpls implements StudentServiceInterface{


    private StudentDAO studentDAO;


    @Autowired
    public StudentServiceImpls(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public StudentServiceImpls() {
    }

    @Override
    public List<StudentEntity> getAllStudents() {
      return studentDAO.fetchAllStudent();
    }
}
