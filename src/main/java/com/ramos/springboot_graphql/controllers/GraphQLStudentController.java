package com.ramos.springboot_graphql.controllers;

import com.ramos.springboot_graphql.entities.Course;
import com.ramos.springboot_graphql.entities.Student;
import com.ramos.springboot_graphql.graphql.InputStudent;
import com.ramos.springboot_graphql.services.ICourseService;
import com.ramos.springboot_graphql.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLStudentController {

    @Autowired
    private IStudentService studentService;

    @Autowired
    private ICourseService courseService;

    @QueryMapping(name = "findStudentById")
    public Student findById(@Argument(name = "studentId") String id){
        Long studentID = Long.parseLong(id);

        return studentService.findById(studentID);
    }

    @QueryMapping(name = "findAllStudents")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @MutationMapping(name = "createStudents")
    public Student createStudent(@Argument InputStudent inputStudent){
        Course course = courseService.findById(Long.parseLong(inputStudent.getCourseId()));
        Student student = new Student();

        student.setName(inputStudent.getName());
        student.setLastname(inputStudent.getLastname());
        student.setAge(inputStudent.getAge());
        student.setCourse(course);

        studentService.createStudent(student);

        return student;
    }

    @MutationMapping(name = "deleteStudentById")
    public String deleteById(@Argument(name = "studentId") String id){
        studentService.deleteById(Long.parseLong(id));

        return "Estudiante eliminado";
    }
}
