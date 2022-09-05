package com.cydeo;

import com.cydeo.entity.Student;
import com.cydeo.service.CRUDService;
import com.cydeo.service.StudentService;

import java.util.ArrayList;
import java.util.List;

import static com.cydeo.database.Database.courseList;
import static com.cydeo.database.Database.parentList;

public class SchoolMainRunner {

//    public static CRUDService<School> schoolService;
//    public static CRUDService<Course> courseService;
//    public static CRUDService<Parent> parentService;
    public static CRUDService<Student> studentService;
//
    static {
//        SchoolMainRunner.schoolService = new SchoolService();
//        SchoolMainRunner.courseService = new CourseService();
//        SchoolMainRunner.parentService = new ParentService();
        SchoolMainRunner.studentService = new StudentService();
    }

    public static void main(String[] args) {

        System.out.println(studentService.findById(1));
        //System.out.println(studentService.findById(3));

        System.out.println("-------------------------------");

        System.out.println(studentService.findAll());

        System.out.println("-------------------------------");

        Student st = new Student(3,12347L, "Daniel", "John", parentList.get(0), courseList );
        studentService.save(st);

        System.out.println("-------------------------------");

        //studentService.update(st);

        System.out.println("-------------------------------");

        studentService.deleteById(1L);
        //System.out.println(studentService.findAll());





    }


}
