package com.ramos.springboot_graphql.graphql;

import com.ramos.springboot_graphql.entities.Student;
import lombok.Data;

import java.util.List;

@Data
public class InputCourse {

    private String name;
    private String category;
    private String teacher;
    private List<Student> students;
}
