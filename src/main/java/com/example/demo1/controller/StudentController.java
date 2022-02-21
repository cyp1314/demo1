package com.example.demo1.controller;


import com.example.demo1.entity.Student;
import com.example.demo1.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cyp
 * @since 2022-02-21
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @PostMapping("/save")
    public boolean save(@RequestBody Student student){
        boolean save = studentService.save(student);
        return save;
    }

    @GetMapping("/list")
    public List<Student> find(){
        List<Student> list = studentService.list();
        return list;
    }

    @GetMapping("/one")
    public Student one(){
        Student student = studentService.selectById(1L);
        return student;
    }
}
