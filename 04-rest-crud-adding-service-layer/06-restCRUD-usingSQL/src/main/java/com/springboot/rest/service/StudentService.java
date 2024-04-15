package com.springboot.rest.service;

import com.springboot.rest.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<StudentEntity> fetchAllStudent();

    StudentEntity getStudentById(int Id);


    StudentEntity addOrUpdateStudent(StudentEntity student);

    void removeStudentById(int Id);

}
