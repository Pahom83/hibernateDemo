package ru.netology.hibernatedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernatedemo.domain.Person;
import ru.netology.hibernatedemo.domain.User;

import java.util.List;
@Repository
public interface PersonRepositoryJpa extends JpaRepository<Person, User> {
    List<Person> findPersonByCityOfLiving (String cityOfLiving);
}
