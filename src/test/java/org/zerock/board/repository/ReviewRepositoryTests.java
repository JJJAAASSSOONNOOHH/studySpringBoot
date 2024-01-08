package org.zerock.board.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.entity.Movie;
import org.zerock.board.entity.MovieMember;
import org.zerock.board.entity.Review;

import java.util.stream.IntStream;

@SpringBootTest
public class ReviewRepositoryTests {
    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void insertMovieReviews() {
        IntStream.rangeClosed(1, 200).forEach(i -> {
            // 영화 번호
            Long mno = (long)(Math.random() * 100) + 1;

            // Reviewer 번호
            Long mId = ((long)(Math.random() * 100) + 1) ;
            MovieMember movieMember = MovieMember.builder().mId(mId).build();

            Review review = Review.builder()
                    .movieMember(movieMember)
                    .movie(Movie.builder().mno(mno).build())
                    .grade((int)(Math.random() * 5) + 1)
                    .text("영화 리뷰 #" + i)
                    .build();

            reviewRepository.save(review);
        });
    }
}
