package com.ramos.springboot_graphql.persistence;

import org.springframework.data.repository.CrudRepository;

import java.awt.*;

public interface ICourseDAO extends CrudRepository<Cursor, Long> {
}
