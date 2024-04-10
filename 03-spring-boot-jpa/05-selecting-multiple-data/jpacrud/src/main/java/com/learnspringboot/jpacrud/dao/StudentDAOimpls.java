package com.learnspringboot.jpacrud.dao;

import com.learnspringboot.jpacrud.entity.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


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

    @Override
    public Student getStudent(int studentId) {
        return entityManager.find(Student.class,studentId);
    }

    @Override
    public List<Student> getAllStudent() {
        TypedQuery typedQuery=entityManager.createQuery("FROM Student",Student.class);
        return typedQuery.getResultList();
    }

    @Override
    public List<Student> getAllStudentByNameDescending() {
        TypedQuery typedQuery= entityManager.createQuery("FROM Student order by email",Student.class);
        return typedQuery.getResultList();
    }

    @Override
    public List<Student> getStudentByLastName(String lastName) {
       TypedQuery typedQuery=entityManager.createQuery("FROM Student where lastName=:theData",Student.class);
       typedQuery.setParameter("theData",lastName);
       return typedQuery.getResultList();
    }
}
