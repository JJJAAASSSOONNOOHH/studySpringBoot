package org.zerock.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.board.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
