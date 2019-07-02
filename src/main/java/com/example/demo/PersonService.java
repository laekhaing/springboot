package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonService {

    @Autowired
    PersonMapper personMapper;

    public Person findById (Integer id) {
        Person person = personMapper.findById(id);
        return person;
    }

    public List<Person> findAll(){
        List<Person> personList = personMapper.findAll();
        return personList;
    }

}