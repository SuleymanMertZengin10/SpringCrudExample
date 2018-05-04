package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@Service
public class PersonServiceImp implements PersonService{

	@Autowired
	PersonRepository personRepository;
	
	
	@Override
	public List<Person> findAll() {
		
		return personRepository.findAll();
	}

	@Override
	public Person findOne(int id) {
	
		return personRepository.getOne(id);
	}

	@Override
	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		return  personRepository.save(person);
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
		
	}

}
