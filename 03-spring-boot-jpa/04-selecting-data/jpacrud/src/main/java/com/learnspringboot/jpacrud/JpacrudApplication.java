package com.learnspringboot.jpacrud;

import com.learnspringboot.jpacrud.dao.StudentDAO;
import com.learnspringboot.jpacrud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpacrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpacrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
//			insertStudent(studentDAO);
			readStudentData(studentDAO);
		};
	}

	private void readStudentData(StudentDAO studentDAO) {
		Student student=new Student();
		student.setId(1);
		//pass studentId
		Student student1 = studentDAO.getStudent(student.getId());
		System.out.println(student1);
	}

	private void insertStudent(StudentDAO studentDAO) {

		//create student object
		Student student=new Student("bhola","devkota","bholaq@gmail.com");
		System.out.println("Creating new student object");

		//save student object
		studentDAO.save(student);
		System.out.println("Student saved");

		//display Student Id
		System.out.println("Student Id :- "+student.getId());
	}
}
