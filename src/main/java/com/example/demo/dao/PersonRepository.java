package com.example.demo.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;



/**
 * Created by abraun on 23/11/2017.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> 
{
	
}
