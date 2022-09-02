package com.cydeo.service;

import com.cydeo.entity.Person;

import java.util.List;

public class PersonService implements CRUDService<Person>{
    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public void save(Person person) {

    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
