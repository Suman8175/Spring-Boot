package com.springboot.rest.DAO.implementation;

import com.springboot.rest.DAO.StudentDAO;
import com.springboot.rest.entity.StudentEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOimpls implements StudentDAO {


    private final EntityManager entityManager;

    @Autowired
    public StudentDAOimpls(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<StudentEntity> fetchAllStudent() {
        TypedQuery<StudentEntity> typedQuery = entityManager.createQuery("FROM StudentEntity ", StudentEntity.class);
        return typedQuery.getResultList();
    }

    @Override
    public StudentEntity getStudentById(int Id) {
    return    entityManager.find(StudentEntity.class,Id);
    }

    @Override
    public StudentEntity insertStudent(StudentEntity student) {
       return entityManager.merge(student);
    }

    @Override
    public void deleteById(int Id) {
        StudentEntity studentEntity = entityManager.find(StudentEntity.class, Id);
        entityManager.remove(studentEntity);
    }
}
