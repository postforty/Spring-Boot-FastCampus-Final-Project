package com.fastcampus.board.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fastcampus.board.model.entity.Board;
import com.fastcampus.board.model.entity.BoardRepository;

@SpringBootTest
public class BoardTests {
	
	@Autowired
	private BoardRepository boardRepository;
	
	@Test
	@Transactional
	public void create() {
		Board board = new Board();
		board.setTitle("제목1");
		board.setWriter("작성자1");
		board.setContent("내용1");
		board.setRegDate(LocalDateTime.now());
		board.setCnt(0L);
		Board newBoard = boardRepository.save(board);
		System.out.println("newBoard : "+newBoard);
	}
	
//	@Test
//	@Transactional
//	public void read() {
//		
//		// select * from user where id = ?
//		Optional<Board> board = repository.findBySeq(1L);
//		
//		board.ifPresent(selectBoard ->{
//			System.out.println("board : "+selectBoard);
//			
//		});
//	}
	
//	@Test
//	@Transactional
//	public void update() {
//		Optional<Board> board = repository.findBySeq(1L);
//		
//		board.ifPresent(selectBoard ->{
//			selectBoard.setTitle("제목1_수정");
//			selectBoard.setWriter(작성자1_수정");
//			selectBoard.setContent("내용1_수정");
//			selectBoard.setRegDate(LocalDateTime.now());
//			selectBoard.setCnt(0L);
//			
//			repository.save(selectBoard);
//		});
//	}
	
//	@Test
//	@Transactional
//	public void delete() {
//		Optional<Board> board = repository.findBySeq(1L);
//		
//		assertTrue(board.isPresent());
//		
//		board.ifPresent(selectBoard ->{
//			repository.delete(selectBoard);
//		});
//		
//		Optional<Board> deleteBoard = repository.findById(1L);
//		
//		assertFalse(deleteBoard.isPresent());
//		
//	}

}
