package com.cydeo;

import com.cydeo.database.Database;
import com.cydeo.entity.Course;
import com.cydeo.enums.WeekDays;
import com.cydeo.service.CRUDService;
import com.cydeo.service.CourseService;

import java.util.List;

public class SchoolMainRunner {

//    public static CRUDService<School> schoolService;
   public static CRUDService<Course> courseService;
//    public static CRUDService<Parent> parentService;
//    public static CRUDService<Student> studentService;
//
    static {
 //       SchoolMainRunner.schoolService = new SchoolService();
        SchoolMainRunner.courseService = new CourseService();
//        SchoolMainRunner.parentService = new ParentService();
//        SchoolMainRunner.studentService = new StudentService();
   }

    public static void main(String[] args) {

        System.out.println("---------findById--------");
        System.out.println(courseService.findById(1));

        System.out.println("----------findAll--------");
        System.out.println(courseService.findAll());

        System.out.println("-----------save-----------");
        courseService.save(new Course(4,"French", 40, List.of(WeekDays.MONDAY, WeekDays.THURSDAY)));
        System.out.println(Database.courseList);

        System.out.println("----------update---------");
        courseService.update(new Course(1,"Spanish", 40, List.of(WeekDays.MONDAY, WeekDays.THURSDAY)));
        System.out.println(Database.courseList);

        System.out.println("-----------deleteById---------");
        courseService.deleteById(2L);
        System.out.println(Database.courseList);


    }


}
