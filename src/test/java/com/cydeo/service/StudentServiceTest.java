package com.cydeo.service;

import com.cydeo.entity.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void testFindAll() {
        CRUDService<Student> studentCRUDService = new StudentService();
        assertEquals(2, studentCRUDService.findAll().size());

    }
}