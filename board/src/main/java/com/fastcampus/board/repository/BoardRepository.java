package com.fastcampus.board.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fastcampus.board.model.entity.Board;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {
	Optional<Board> findBySeq(Long seq);
}
