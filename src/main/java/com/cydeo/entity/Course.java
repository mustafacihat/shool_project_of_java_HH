package com.cydeo.entity;


import com.cydeo.enums.WeekDays;
import lombok.*;

import java.util.List;

/**
 * I could not see any progress on the service methods of Course entity Hamza.
 * I could not see any progress on the service methods of Course entity Sabina.
 * Come together your pairs and try to write your code.
 * You can check your codes inside main method which created inside SchoolMainRunner
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course extends BaseEntity{

    private String name;
    private int minScore;
    private List<WeekDays> courseDay;

    public Course(int id, String name, int minScore, List<WeekDays> courseDay) {
        super(id);
        this.name = name;
        this.minScore = minScore;
        this.courseDay = courseDay;
    }
}
