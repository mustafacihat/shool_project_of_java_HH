package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class StudentService implements CRUDService<Student>{
    @Override
    public Student findById(int id) {
        return Database.studentList.stream()
                .filter(student -> student.getId() == id)
                .findFirst().orElseThrow(()->new NoSuchElementException("No such a student found!"));
    }

    @Override
    public List<Student> findAll() {
        return Database.studentList;

    }

    @Override
    public void save(Student student) {
        Database.studentList.add(student);
        System.out.println(Database.studentList);

    }

    @Override
    public void update(Student student) {
        save(student);
    }

    @Override
    public void deleteById(Long id) {
        Database.studentList.removeIf(student -> student.getId()==id);
        System.out.println(Database.studentList);
//        Database.studentList.stream()
//                .filter(student -> student.getId() == id)
//                .findFirst()
//                .map(student -> Database.studentList.remove(student))
//                .stream()
//                .collect(Collectors.toList());


    }
}
