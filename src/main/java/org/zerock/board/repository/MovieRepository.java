package org.zerock.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.board.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
