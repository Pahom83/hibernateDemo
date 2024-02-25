package ru.netology.hibernatedemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @EmbeddedId
    private Buyer buyer;
    @Column(name = "phone_number", nullable = false)
    private int phoneNumber;
    @Column(name = "city_of_living", length = 50, nullable = false)
    private String cityOfLiving;
}