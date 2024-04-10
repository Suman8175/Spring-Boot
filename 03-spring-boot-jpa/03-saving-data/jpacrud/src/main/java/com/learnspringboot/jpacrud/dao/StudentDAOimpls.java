package com.learnspringboot.jpacrud.dao;

import com.learnspringboot.jpacrud.entity.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class StudentDAOimpls implements StudentDAO{
       //define a entity manager
         private final EntityManager entityManager;

   //use dependency injection (constructor injection)
   @Autowired
    public StudentDAOimpls(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
       entityManager.persist(student);
    }
}
