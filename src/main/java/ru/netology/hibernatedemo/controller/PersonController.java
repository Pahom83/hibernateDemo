package ru.netology.hibernatedemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatedemo.domain.Person;
import ru.netology.hibernatedemo.service.PersonService;

import javax.annotation.security.RolesAllowed;
import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/")
public class PersonController {

    private final PersonService personService;

    @GetMapping("/persons/by-city")
    @PreAuthorize("hasRole('ROLE_WRITE') or hasRole('ROLE_DELETE')")
    public List<Person> getCity(@RequestParam("city") String city){
        return personService.getPersonByCity(city);
    }

    @Secured("ROLE_READ")
    @GetMapping("/hello")
    public String hello (){
        return "Hello";
    }
    @GetMapping("/writeUsers")
    @RolesAllowed("ROLE_WRITE")
    public String writeDeleteUser (){
        return "This endpoint only users with ROLE WRITE";
    }
    @GetMapping("/checkUserName")
    @PreAuthorize("#username == authentication.principal.username")
    public String checkUserName(String username){
        return "Welcome, " + username;
    }
}
