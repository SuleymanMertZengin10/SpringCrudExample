package com.example.demo.service;

import java.util.List;


import com.example.demo.model.Person;

public interface PersonService {

    List<Person> findAll();

    Person findOne(int id);

    Person savePerson(Person notes);

    void deletePerson(int id);
	
}
