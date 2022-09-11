package com.cydeo.service;

import com.cydeo.entity.Parent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentServiceTest {

    @Test
    void testFindAll() {
        CRUDService<Parent> parentCRUDService = new ParentService();
        assertEquals(2,parentCRUDService.findAll().size());
    }
}