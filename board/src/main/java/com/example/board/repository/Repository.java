package com.example.board.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.board.model.entity.Board;

public interface Repository extends CrudRepository<Board, Long> {
	
}
