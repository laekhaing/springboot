package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sample")
public class RestApiController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "{id}", method=RequestMethod.GET)
    public Person getPerson(@PathVariable("id") Integer id){
    	return personService.findById(id);
    }

	@RequestMapping( "/personList" )
	public List<Person> getPersonList() {
	   return personService.findAll();
	}

	/* @RequestMapping(value = "/persons", method=RequestMethod.GET)
	public String index(Model model) {
	    List<Person> persons = personService.findAll();
	    model.addAttribute("person", persons);
	    return "persons/index";
	}*/
}