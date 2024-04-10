package com.learnspringboot.jpacrud;

import com.learnspringboot.jpacrud.dao.StudentDAO;
import com.learnspringboot.jpacrud.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpacrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpacrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
//			insertStudent(studentDAO);
//			readStudentData(studentDAO);
			queryForAllStudent(studentDAO);
//			queryForAllStudentByOrder(studentDAO);
//			getStudentWhoseLastNameIsSame(studentDAO);
//			changeLastName(studentDAO);
			//whose last name is devkota
//			changeLastNameOfAllStudent(studentDAO);
		};
	}

	private void changeLastNameOfAllStudent(StudentDAO studentDAO) {
		System.out.println("Changing student's last name");
		int noOfRows = studentDAO.updateStudentBasedOnLastName("devkota");
		System.out.println("Affected rows: "+noOfRows);
	}

	private void changeLastName(StudentDAO studentDAO) {
		Student student=studentDAO.getStudent(1);
		student.setEmail("random@gmail.com");
		studentDAO.updateStudent(student);
	}

	private void getStudentWhoseLastNameIsSame(StudentDAO studentDAO) {

		List<Student> studentByLastName = studentDAO.getStudentByLastName("devkota");
		for (Student s:studentByLastName){
			System.out.println(s);
		}
	}

	private void queryForAllStudentByOrder(StudentDAO studentDAO) {
		List<Student> allStudentByNameDescending = studentDAO.getAllStudentByNameDescending();
		for (Student s:allStudentByNameDescending){
			System.out.println(s);
		}
	}

	private void queryForAllStudent(StudentDAO studentDAO) {
		List<Student> studentList =studentDAO.getAllStudent();
		for (Student student:studentList){
			System.out.println(student);
		}
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
