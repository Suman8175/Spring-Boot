package com.springboot.rest.controller.StudentController;


import com.springboot.rest.entity.StudentEntity;
import com.springboot.rest.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //fetch all students
    @GetMapping("/students")
    public List<StudentEntity> getStudent(){
        return studentService.fetchAllStudent();
    }

    //fetch specific students

    @GetMapping("/students/{studentId}")
    public StudentEntity getStudentById(@PathVariable int studentId){
        return studentService.getStudentById(studentId);
    }

    //Adding a new Student

    @PostMapping("/students")
    public StudentEntity addNewStudent(@RequestBody StudentEntity student){
        student.setId(0);
        return studentService.addOrUpdateStudent(student);
    }

    @DeleteMapping("/students/{studentId}")
    public String removeStudentById(@PathVariable int studentId){
        studentService.removeStudentById(studentId);
        return "Student deleted"+studentId;
    }

}
