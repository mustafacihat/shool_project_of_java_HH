package com.cydeo.entity;

import lombok.*;

import java.util.List;

/**
 * I could not see any progress on the service methods of School entity Esmira.
 * I could not see any progress on the service methods of School entity Alena.
 * Come together your pairs and try to write your code.
 * You can check your codes inside main method which created inside SchoolMainRunner
 */

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
