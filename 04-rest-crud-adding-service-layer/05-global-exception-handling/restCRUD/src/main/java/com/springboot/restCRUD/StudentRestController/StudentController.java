package com.springboot.restCRUD.StudentRestController;


import com.springboot.restCRUD.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        if ( (studentId >= list.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudents.get(studentId);

        return list.get(studentId);
    }

}
