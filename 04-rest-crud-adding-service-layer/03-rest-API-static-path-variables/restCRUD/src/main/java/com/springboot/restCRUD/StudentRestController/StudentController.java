package com.springboot.restCRUD.StudentRestController;


import com.springboot.restCRUD.entity.Student;
import com.springboot.restCRUD.StudentRestController.exception.StudentErrorResponse;
import com.springboot.restCRUD.StudentRestController.exception.StudentNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student> list;

    @PostConstruct
    public void fillStudentList(){
         list=new ArrayList<Student>();
        list.add(new Student("Suman","Devkota"));
        list.add(new Student("Salman","Khan"));
        list.add(new Student("Saurav","Timilsina"));
    }

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        return list;
    }

    @GetMapping("/student/{studentId}")

    public Student getStudentByIndexOfList(@PathVariable int studentId){
    //Adding the condition to check if student is present or not

        if (list.size()<studentId || studentId<0){
            throw new StudentNotFoundException("Student not found with id:- "+studentId);
        }

        return list.get(studentId);
    }


}
