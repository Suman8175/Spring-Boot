package com.learnspringboot.jpacrud.dao;

import com.learnspringboot.jpacrud.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);
    Student getStudent(int studentId);
    List<Student> getAllStudent();
    List<Student> getAllStudentByNameDescending();
    List<Student> getStudentByLastName(String lastName);

    public void updateStudent(Student student);

    public int updateStudentBasedOnLastName(String lastName);
}
