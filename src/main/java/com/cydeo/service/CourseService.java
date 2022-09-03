package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Course;

import java.util.List;
import java.util.NoSuchElementException;

public class CourseService implements CRUDService<Course> {

    //All the methods that needs to be implemented for courses
    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public List<Course> findAll() {
        return Database.courseList;
    }

    @Override
    public void save(Course course) {

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void deleteById(Long id) {


    }
}
