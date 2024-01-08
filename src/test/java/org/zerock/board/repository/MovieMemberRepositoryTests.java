package org.zerock.board.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.entity.MovieMember;

import java.util.stream.IntStream;

@SpringBootTest
public class MovieMemberRepositoryTests {
    @Autowired
    private MovieMemberRepository movieMemberRepository;

    @Test
    public void insertMovieMembers() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            MovieMember movieMember = MovieMember.builder()
                    .email("r" + i + "@test.com")
                    .pw("1111")
                    .nickname("reviewer" + i)
                    .build();
            movieMemberRepository.save(movieMember);
        });
    }
}
