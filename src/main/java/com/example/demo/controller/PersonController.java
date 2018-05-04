package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@Controller
public class PersonController {

	@Autowired
	PersonService personService;
	
    
	   @RequestMapping(value="/")
	    public String personList(Model model) {
	        model.addAttribute("personList", personService.findAll());
	        return "personList";
	    }
	   
	    @RequestMapping(value={"/personEdit","/personEdit/{id}"}, method = RequestMethod.GET)
	    public String notesEditForm(Model model, @PathVariable(required = false, name = "id") Integer id) {
	        if (null!=id) {
	            model.addAttribute("person", personService.findOne(id));
	        } else {
	            model.addAttribute("person", new Person());
	        }
	        return "personEdit";
	    }
    
	    @RequestMapping(value="/personEdit", method = RequestMethod.POST)
	    public String notesEdit(Model model, Person person) {
	    	personService.savePerson(person);
	        model.addAttribute("personList", personService.findAll());
	        return "personList";
	    }

    
	    @RequestMapping(value="/personDelete/{id}", method = RequestMethod.GET)
	    public String notesDelete(Model model, @PathVariable(required = true, name = "id") int id) {
	    	personService.deletePerson(id);
	        model.addAttribute("personList", personService.findAll());
	        return "personList";
	    }
	 
	
	
	
	
}
