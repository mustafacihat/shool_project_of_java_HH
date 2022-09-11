package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.School;

import java.util.List;
import java.util.NoSuchElementException;

public class SchoolService implements CRUDService<School> {

    @Override
    public School findById(int id) {
        return Database.schoolList.stream()
                .filter(p -> p.getId() == id)
                .findFirst().orElseThrow(() -> new NoSuchElementException("Not found by id"));

    }

    @Override
    public List<School> findAll() {
        return Database.schoolList;
    }

    @Override
    public void save(School school) {
        Database.schoolList.add(school);
    }

    @Override
    public void update(School school) {
        deleteById((long) school.getId());
        save(school);
    }

    @Override
    public void deleteById(Long id) {
        School school2 = Database.schoolList.stream()
                .filter(course -> course.getId() == id)
                .findFirst().orElseThrow(() -> new NoSuchElementException("Not found by id"));

        Database.courseList.remove(school2);


    }
}
