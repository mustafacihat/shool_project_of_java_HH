package com.cydeo.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class School extends BaseEntity {

    private String name;
    private List<Student> students;
    private List<Course> courses;

    public School(int id, String name, List<Student> students, List<Course> courses) {
        super(id);
        this.name = name;
        this.students = students;
        this.courses = courses;
    }
}
