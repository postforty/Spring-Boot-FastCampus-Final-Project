package com.fastcampus.board.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.fastcampus.board.BoardApplicationTests;
import com.fastcampus.board.model.entity.Board;

public class BoardRepositoryTest extends BoardApplicationTests {
	
	@Autowired
	private BoardRepository boardRepository;

//	@Test
//	public void create() {
//		Board board = new Board();
//		
//		board.setContent("내용1");
//		board.setWriter("작성자1");
//		board.setTitle("제목1");
//		board.setRegDate(LocalDateTime.now());
//		board.setCnt(0L);
//		
//		Board newBoard = boardRepository.save(board);
//		System.out.println("newBoard : "+newBoard);
//	}
	
//	@Test
//	public Board read(@RequestParam Long seq) {
//		Optional<Board> board = boardRepository.findById(seq);
//		
//		// board 값이 존재한다면
//		board.ifPresent(selectBoard -> {
//			System.out.println("board : "+selectBoard);
//			System.out.println("regDate : "+selectBoard.getRegDate());
//		});
//		
//		return board.get();
//	}
	
	@Test
	public void read() {
		Iterable<Board> board = boardRepository.findAll();
		
		System.out.println("board : "+board);
	}
	
//	@Test
//	public void update() {
//		Optional<Board> board = boardRepository.findById(12L);
//		
//		// board 값이 존재한다면
//		board.ifPresent(selectBoard -> {
//			selectBoard.setContent("내용수정");
//			selectBoard.setWriter("작성자수정");
//			selectBoard.setTitle("제목수정");
//			selectBoard.setRegDate(LocalDateTime.now());
//			
//			boardRepository.save(selectBoard);
//		});
//	}
	
//	@DeleteMapping("/api/board")
//	public void delete(@RequestParam Long seq) {
//		
//	}
	
//	@Test
//	@Transactional // 데이터 롤백
//	public void delete() {
//		Optional<Board> board = boardRepository.findById(11L);
//		
//		board.ifPresent(selectBoard -> {
//			boardRepository.delete(selectBoard);
//		});
//		
//		// 삭제가 되었는지 확인
//		Optional<Board> deleteBoard = boardRepository.findById(12L);
//		
//		if(deleteBoard.isPresent()) {
//			System.out.println("데이터 존재 : "+deleteBoard.get());
//		} else {
//			System.out.println("데이터 없음");
//		}
//	}
}
