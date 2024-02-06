package ru.netology.hibernatedemo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatedemo.domain.Person;

import java.util.List;
@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<Person> findPersonByCity(String city) {
        var query = entityManager.createQuery("select person from Person person where person.cityOfLiving like ?1", Person.class);
        query.setParameter(1, city);
        return query.getResultList();
    }
}
