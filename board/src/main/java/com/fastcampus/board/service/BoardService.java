package com.fastcampus.board.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fastcampus.board.dto.BoardDto;
import com.fastcampus.board.model.entity.Board;
import com.fastcampus.board.repository.BoardRepository;

@Service
public class BoardService {
	private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    // 게시물 생성
    @Transactional
    public Long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity(0L)).getSeq();
    }
    
    // 게시물 수정
    @Transactional
    public Long updatePost(BoardDto boardDto) {
    	Board board = boardRepository.findById(boardDto.getSeq()).get();
    	System.out.println("board : "+board);
    	return boardRepository.save(boardDto.toEntity(board.getCnt())).getSeq();
    }
    
    // 게시물 전체 가져오기
    @Transactional
    public List<BoardDto> getBoardList() {
        Iterable<Board> boardList = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();

        for(Board board : boardList) {
            BoardDto boardDto = BoardDto.builder()
                    .seq(board.getSeq())
                    .writer(board.getWriter())
                    .title(board.getTitle())
                    .content(board.getContent())
                    .regDate(board.getRegDate())
                    .cnt(board.getCnt())
                    .build();
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }
    
    // 게시물 삭제
    @Transactional
    public void deletePost(Long id) {
        boardRepository.deleteById(id);
    }
    
    // 게시물 상세 조회
    @Transactional
    public BoardDto getPost(Long id) {
        Board board = boardRepository.findById(id).get();
        
        // 조회수 +1
        if(board.getCnt() == null) {
        	board.setCnt(1L);
        } else {
        	board.setCnt(board.getCnt()+1);
        }
        
        BoardDto boardDto = BoardDto.builder()
                .seq(board.getSeq())
                .writer(board.getWriter())
                .title(board.getTitle())
                .content(board.getContent())
                .regDate(board.getRegDate())
                .build();
        return boardDto;
    }

}
