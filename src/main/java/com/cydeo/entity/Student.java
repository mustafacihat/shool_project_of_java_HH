package com.cydeo.entity;

import lombok.*;

import java.util.List;

/**
 * I could not see any progress on the service methods of Student entity Mizgin.
 * I could not see any progress on the service methods of Student entity Tatiana.
 * Come together your pairs and try to write your code.
 * You can check your codes inside main method which created inside SchoolMainRunner
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student  extends BaseEntity{

    private Long studentNumber;
    private String firstName;
    private String lastName;
    private Parent parent;
    private List<Course> courses;

    public Student(int id, Long studentNumber, String firstName, String lastName, Parent parent, List<Course> courses) {
        super(id);
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.parent = parent;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" + "id= " + id +
                "studentNumber=" + studentNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", parent=" + parent +
                ", courses=" + courses +
                '}';
    }
}
