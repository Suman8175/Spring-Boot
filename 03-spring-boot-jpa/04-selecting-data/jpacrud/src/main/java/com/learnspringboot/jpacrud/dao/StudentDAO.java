package com.learnspringboot.jpacrud.dao;

import com.learnspringboot.jpacrud.entity.Student;

public interface StudentDAO {
    public void save(Student student);
    Student getStudent(int studentId);
}
