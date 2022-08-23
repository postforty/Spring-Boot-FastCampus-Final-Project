package com.fastcampus.board.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.After;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fastcampus.board.model.entity.Board;
import com.fastcampus.board.model.entity.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTests {
	
	@Autowired
	BoardRepository boardRepository;
	
	@After
	public void cleanup() {
		boardRepository.deleteAll();
	}
	
	@Test
	public void 게시글저장_불러오기() {
		// given
		String title = "테스트 게시글";
		String content = "테스트 본문";
		
//		boardRepository.save(Board.builder()
//				.title(title)
//				.content(content)
//				.writer("테스트 작성자")
//				.build());
		
		// when
		List<Board> boardList = boardRepository.findAll();
		
		// then
		Board board = boardList.get(1);
		assertThat(board.getTitle()).isEqualTo(title);
		assertThat(board.getContent()).isEqualTo(content);
		
	}
	
//	@Test
//	@Transactional
//	public void create() {
//		Board board = new Board();
//		board.setTitle("제목1");
//		board.setWriter("작성자1");
//		board.setContent("내용1");
//		board.setRegDate(LocalDateTime.now());
//		board.setCnt(0L);
//		Board newBoard = boardRepository.save(board);
//		System.out.println("newBoard : "+newBoard);
//	}
	
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
