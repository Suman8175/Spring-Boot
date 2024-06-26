package com.springboot.rest.service.implementation;


import com.springboot.rest.DAO.StudentDAO;
import com.springboot.rest.entity.StudentEntity;
import com.springboot.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpls implements StudentService {

    public StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpls(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }


    @Override
    public List<StudentEntity> fetchAllStudent() {
        return studentDAO.fetchAllStudent();
    }

    @Override
    public StudentEntity getStudentById(int Id) {
        return studentDAO.getStudentById(Id);
    }

    @Override
    @Transactional
    public StudentEntity addOrUpdateStudent(StudentEntity student) {
       return studentDAO.insertStudent(student);
    }

    @Override
    @Transactional
    public void removeStudentById(int Id) {
        studentDAO.deleteById(Id);
    }
}
