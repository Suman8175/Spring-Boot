package com.springboot.rest.DAO;

import com.springboot.rest.entity.StudentEntity;

import java.util.List;

public interface StudentDAO {

    List<StudentEntity> fetchAllStudent();


    //get a specific student by Id
    StudentEntity getStudentById(int Id);

    //insert and update student

    StudentEntity insertStudent(StudentEntity student);

    void deleteById(int Id);

}
