package com.ramos.springboot_graphql.controllers;

import com.ramos.springboot_graphql.entities.Student;
import com.ramos.springboot_graphql.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLStudentController {

    @Autowired
    private IStudentService studentService;

    @QueryMapping(name = "findStudentById")
    public Student findById(@Argument(name = "studentId") String id){
        Long studentID = Long.parseLong(id);

        return studentService.findById(studentID);
    }

}
