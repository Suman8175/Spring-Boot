package com.springboot.rest.service;

import com.springboot.rest.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    List<StudentEntity> fetchAllStudent();
}
