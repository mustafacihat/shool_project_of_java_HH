package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Student;

import java.util.List;
import java.util.NoSuchElementException;

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
    }

    @Override
    public void update(Student student) {
        deleteById((long) student.getId());
        Database.studentList.add(student);
//        Database.studentList.stream()
//                        .filter(student1 -> student1.getId()==student.getId())
//                                .forEach(student1 -> {
//                                    student1.setFirstName(student.getFirstName());
//                                    student1.setLastName(student.getLastName());
//                                });
//        save(student);
    }

    @Override
    public void deleteById(Long id) {
        Student student = findById(id.intValue());
        Database.studentList.remove(student);

//        Database.studentList.removeIf(student -> student.getId()==id); // throw exception
//        System.out.println(Database.studentList);


//        Database.studentList.stream()
//                .filter(student -> student.getId() == id)
//                .findFirst()
//                .map(student -> Database.studentList.remove(student))
//                .stream()
//                .collect(Collectors.toList());


    }
}
