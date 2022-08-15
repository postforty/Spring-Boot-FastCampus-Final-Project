package com.example.board.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.board.model.entity.Board;

public interface Repository extends CrudRepository<Board, Long> {
	
	Optional<Board> findBySeq(Long seq);
}
