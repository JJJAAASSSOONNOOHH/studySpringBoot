package org.zerock.board.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.board.entity.MovieMember;

import java.util.stream.IntStream;

@SpringBootTest
public class MovieMemberRepositoryTests {
    @Autowired
    private MovieMemberRepository movieMemberRepository;

    @Autowired
    private ReviewRepository reviewRepository;

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


    @Commit
    @Transactional
    @Test
    public void testDeleteMembers() {

        Long mId = 1L;

        MovieMember movieMember = MovieMember.builder().mId(mId).build();

        reviewRepository.deleteByMember(movieMember);
        movieMemberRepository.deleteById(mId);


    }
}
