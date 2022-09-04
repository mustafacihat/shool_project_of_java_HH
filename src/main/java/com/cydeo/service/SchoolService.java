package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.School;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SchoolService implements CRUDService<School> {


    @Override
    public School findById(int id) {
        //Stream<Integer> schoolId = Database.schoolList.stream()
               // .map(BaseEntity::getId)
                //.takeWhile(p -> p.equals(id));

//        Database.schoolList.stream().map(p->p.getId())
//                .forEach(p->{
//                    if(p==id) return Database.schoolList.stream().map(p->p.); else try {
//                        throw new Exception("No such school defined by ID");
//                    } catch (Exception e) {
//                        throw new RuntimeException(e);
//                    }
//
//                });
        return null;
    }

    @Override
    public List<School> findAll() {
        return Database.schoolList.stream()
                .collect(Collectors.toList());
    }

    @Override
    public void save(School school) {
        Database.schoolList.add(school);
    }

    @Override
    public void update(School school) {

    }

    @Override
    public void deleteById(Long id) {
          Database.schoolList.removeIf(p->p.getId()==id);
    }
}
