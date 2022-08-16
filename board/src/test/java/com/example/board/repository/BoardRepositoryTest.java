package com.example.board.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fastcampus.board.model.entity.Board;
import com.fastcampus.board.repository.Repository;

@SpringBootTest
public class BoardRepositoryTest {
	
	@Autowired
	private Repository repository;
	
//	@Test
//	@Transactional
//	public void create() {
//		Board board = new Board();
//		board.setTitle("����2");
//		board.setWriter("�ۼ���2");
//		board.setContent("����2");
//		board.setRegDate(LocalDateTime.now());
//		board.setCnt(0L);
//		
//		Board newBoard = repository.save(board);
//		System.out.println("newBoard : "+newBoard);
//	}
	
	@Test
	@Transactional
	public void read() {
		
		// select * from user where id = ?
		Optional<Board> board = repository.findBySeq(1L);
		
		board.ifPresent(selectBoard ->{
			System.out.println("board : "+selectBoard);
			
		});
	}
	
//	@Test
//	@Transactional
//	public void update() {
//		Optional<Board> board = repository.findBySeq(1L);
//		
//		board.ifPresent(selectBoard ->{
//			selectBoard.setTitle("����1_����");
//			selectBoard.setWriter("�ۼ���1_����");
//			selectBoard.setContent("����1_����");
//			selectBoard.setRegDate(LocalDateTime.now());
//			selectBoard.setCnt(0L);
//			
//			repository.save(selectBoard);
//		});
//	}
	
	@Test
	@Transactional
	public void delete() {
		Optional<Board> board = repository.findBySeq(1L);
		
		assertTrue(board.isPresent());
		
		board.ifPresent(selectBoard ->{
			repository.delete(selectBoard);
		});
		
		Optional<Board> deleteBoard = repository.findById(1L);
		
		assertFalse(deleteBoard.isPresent());
		
	}

}
