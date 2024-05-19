package com.example.uberreviewservice.Models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.processing.Generated;
import java.util.Date;

@Getter   //This anno creates the getters for all fields (lombok package)
@Setter   //This anno creates the setters for all fields (lombok package)

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity()

@Table(name = "booking_review") //Nothing to do with Java logic. It helps in Databases names.
public class Review extends BaseModel{

    @Column(nullable = false)
    private String content;

    Double rating;



}
