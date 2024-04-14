package com.springboot.restCRUD.StudentRestController;


import com.springboot.restCRUD.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/student")
    public List<Student> getAllStudent(){
        ArrayList<Student> list=new ArrayList<Student>();
        list.add(new Student("Suman","Devkota"));
        list.add(new Student("Salman","Khan"));
        list.add(new Student("Saurav","Timilsina"));
        return list;
    }
}
