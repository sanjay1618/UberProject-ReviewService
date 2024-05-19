package com.example.uberreviewservice.Servies;

import com.example.uberreviewservice.Models.Review;
import com.example.uberreviewservice.Repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import com.example.uberreviewservice.Models.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********");
        Review r = Review.builder()
                .content("The ride was exceptional")
                .rating(5.0)
                .build();
        reviewRepository.save(r);  //this code executes sql query of inserting into DB

        List<Review> reviewList = reviewRepository.findAll();
        for (Review review : reviewList){
            System.out.println(review.getContent());
        }
    }
}