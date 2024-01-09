package org.zerock.board.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.board.entity.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query("select m, mi, coalesce(avg(r.grade), 0), count(distinct r) from Movie m " +
            "left join MovieImage mi on mi.movie = m " +
            "left join Review r on r.movie = m group by m, mi")
    Page<Object[]> getListPage(Pageable pageable); // 페이징 처리

    @Query("select m, mi, coalesce(avg(r.grade), 0), count(distinct r) " +
            " from Movie m left outer join MovieImage mi on mi.movie = m " +
            " left outer join Review r on r.movie = m " +
            " where m.mno = :mno group by mi")
    List<Object[]> getMovieWithAll(@Param("mno") Long mno); // 특정 영화 조회

}
