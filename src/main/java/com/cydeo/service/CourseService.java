package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.Course;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.NoSuchElementException;

public class CourseService implements CRUDService<Course> {
    @Override
    public Course findById(int id) {
        return Database.courseList.stream()
                .filter(course -> course.getId()==id)
                .findFirst().orElseThrow(()->new NoSuchElementException("Not found by id"));
    }

    @Override
    public List<Course> findAll() {
        return Database.courseList;
    }

    @Override
    public void save(Course course) {
        Database.courseList.add(course);

    }

    @Override
    public void update(Course course) {
        deleteById((long) course.getId());
        save(course);


    }

    @Override
    public void deleteById(Long id) {

        Course idCourse = Database.courseList.stream()
                .filter(course->course.getId()==id)
                .findFirst().orElseThrow(()->new NoSuchElementException("Not found by id"));

        Database.courseList.remove(idCourse);
    }
}
