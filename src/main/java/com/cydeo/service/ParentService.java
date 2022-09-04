package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Parent;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

public class ParentService implements CRUDService<Parent> {


    @Override
    public Parent findById(int id) {
        return Database.parentList.stream()
                .filter(parent -> parent.id == id)
                .findFirst().orElseThrow(()-> new NoSuchElementException("No person found!"));
    }

    @Override
    public List<Parent> findAll() {
        return new ArrayList<>(Database.parentList);
    }

    @Override
    public void save(Parent parent) {
        Database.parentList.add(new Parent());
    }

    @Override
    public void update(Parent parent) {
        Database.parentList.stream()
                .filter(p->p.getId()==parent.getId())
                        .forEach(p-> {
                            p.setFirstName(parent.getFirstName());
                            p.setLastName(parent.getLastName());
                        });
    }

    @Override
    public void deleteById(Long id) {
        Database.parentList.removeIf(parent -> parent.id==id);
    }
}
