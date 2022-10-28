package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //find all course by category
    List<Course> findByCategory(String category);

    //find all course by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //check if a course with the supplied name exists. REurn true if exists, false otherwise
    boolean existsByName(String name);


}
