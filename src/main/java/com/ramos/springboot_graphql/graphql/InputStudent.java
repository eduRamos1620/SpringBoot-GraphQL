package com.ramos.springboot_graphql.graphql;

import lombok.Data;

@Data
public class InputStudent {

    private String name;
    private String lastname;
    private Integer age;
    private String courseId;
}
