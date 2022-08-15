package com.example.board.repository;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.board.model.entity.Board;

@SpringBootTest
public class BoardRepositoryTest {
	
	@Autowired
	private Repository repository;
	
	@Test
	public void create() {
		Board board = new Board();
		board.setTitle("제목1");
		board.setWriter("작성자1");
		board.setContent("내용1");
		board.setRegDate(LocalDateTime.now());
		board.setCnt(0L);
		
		Board newBoard = repository.save(board);
		System.out.println("newBoard : "+newBoard);
				
	}

}
