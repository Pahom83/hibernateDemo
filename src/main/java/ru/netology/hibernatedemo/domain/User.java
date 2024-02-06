package ru.netology.hibernatedemo.domain;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
@ToString
@Embeddable
@EqualsAndHashCode
public class User implements Serializable {
    private String name;
    private String surname;
    private int age;
}
