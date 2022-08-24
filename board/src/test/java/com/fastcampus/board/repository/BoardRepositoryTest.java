package com.fastcampus.board.repository;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.fastcampus.board.BoardApplicationTests;
import com.fastcampus.board.model.entity.Board;

public class BoardRepositoryTest extends BoardApplicationTests {
	
	@Autowired
	private BoardRepository boardRepository;

	@Test
	public void create() {
		Board board = new Board();
		
		board.setContent("내용1");
		board.setWriter("작성자1");
		board.setTitle("제목1");
		board.setRegDate(LocalDateTime.now());
		board.setCnt(0L);
		
		Board newBoard = boardRepository.save(board);
		System.out.println("newBoard : "+newBoard);
	}
	
	public void read() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
}
