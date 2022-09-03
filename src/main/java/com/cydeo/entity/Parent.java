package com.cydeo.entity;

import lombok.*;

/**
 * I could not see any progress on the service methods of Parent entity Marika.
 * I could not see any progress on the service methods of Parent entity Sergiy.
 * Come together your pairs and try to write your code.
 * You can check your codes inside main method which created inside SchoolMainRunner
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Parent extends BaseEntity {

    private String firstName;
    private String lastName;

    public Parent(int id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
