package com.example.board.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.board.model.entity.Board;

@SpringBootTest
public class BoardRepositoryTest {
	
	@Autowired
	private Repository repository;
	
//	@Test
//	@Transactional
//	public void create() {
//		Board board = new Board();
//		board.setTitle("제목2");
//		board.setWriter("작성자2");
//		board.setContent("내용2");
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
//		Optional<Board> board = repository.findBySeq(1L);
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
//			selectBoard.setTitle("제목1_수정");
//			selectBoard.setWriter("작성자1_수정");
//			selectBoard.setContent("내용1_수정");
//			selectBoard.setRegDate(LocalDateTime.now());
//			selectBoard.setCnt(0L);
//			
//			repository.save(selectBoard);
//		});
//	}

}
