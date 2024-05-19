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
@EntityListeners(AuditingEntityListener.class)
@Table(name = "booking_review") //Nothing to do with Java logic. It helps in Databases names.
public class Review {
    @Id //this annotation makes the id property as the primary key of the table.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Identity means autoincrement
    private Long id;
    @Column(nullable = false)
    private String content;

    Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

}
