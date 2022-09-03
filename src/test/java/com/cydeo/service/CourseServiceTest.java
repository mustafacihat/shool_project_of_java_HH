package com.cydeo.service;

import com.cydeo.entity.Course;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceTest {

    @Test
    void testFindAll() {
        CRUDService<Course> courseCRUDService = new CourseService();
        assertEquals(3, courseCRUDService.findAll().size());
    }
}