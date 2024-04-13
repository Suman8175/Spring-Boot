package com.springboot.rest.DAO;

import com.springboot.rest.entity.StudentEntity;

import java.util.List;

public interface StudentDAO {

    List<StudentEntity> fetchAllStudent();
}
