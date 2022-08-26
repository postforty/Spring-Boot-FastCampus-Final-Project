package com.fastcampus.board.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fastcampus.board.model.entity.Board;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {
}
