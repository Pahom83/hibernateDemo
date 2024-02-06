package ru.netology.hibernatedemo.domain;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Builder
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@IdClass(User.class)
public class Person {

    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    @Column(name = "phone_number", nullable = false)
    private int phoneNumber;

    @Column(name = "city_of_living", length = 50, nullable = false)
    private String cityOfLiving;
}
