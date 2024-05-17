package com.example.uberreviewservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Review {
    @Id //this annotation makes the id property as the primary key of the table.
    Long id;

}
