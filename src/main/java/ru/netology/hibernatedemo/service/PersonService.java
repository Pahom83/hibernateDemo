package ru.netology.hibernatedemo.service;


import org.springframework.stereotype.Service;
import ru.netology.hibernatedemo.domain.Person;
import ru.netology.hibernatedemo.exception.NotFoundException;
import ru.netology.hibernatedemo.repository.PersonRepository;

import java.util.List;
@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonByCity(String city) {
        if (personRepository.findPersonByCity(city).isEmpty()){
            throw new NotFoundException("Data not found");
        }
        return personRepository.findPersonByCity(city);
    }
}
