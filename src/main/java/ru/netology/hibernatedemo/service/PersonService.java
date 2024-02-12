package ru.netology.hibernatedemo.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.hibernatedemo.domain.Person;
import ru.netology.hibernatedemo.exception.NotFoundException;
import ru.netology.hibernatedemo.repository.PersonRepositoryJpa;

import java.util.List;
@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepositoryJpa repositoryJpa;

    public List<Person> getPersonByCity(String city) {
        if (repositoryJpa.findPersonByCityOfLiving(city).isEmpty()){
            throw new NotFoundException("Data not found");
        }
        return repositoryJpa.findPersonByCityOfLiving(city);
    }
}
