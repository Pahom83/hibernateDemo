package ru.netology.hibernatedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatedemo.domain.Person;
import ru.netology.hibernatedemo.service.PersonService;

import java.util.List;


@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getCity(@RequestParam("city") String city){
        return personService.getPersonByCity(city);
    }

}
