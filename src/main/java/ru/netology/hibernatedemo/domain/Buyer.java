package ru.netology.hibernatedemo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.io.Serializable;
@ToString
@Data
@Embeddable
@EqualsAndHashCode
public class Buyer implements Serializable {
    private String name;
    private String surname;
    private int age;
}
