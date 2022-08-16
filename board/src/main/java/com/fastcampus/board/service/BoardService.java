package com.fastcampus.board.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.fastcampus.board.dto.BoardRequestDto;
import com.fastcampus.board.dto.BoardResponseDto;
import com.fastcampus.board.model.entity.Board;
import com.fastcampus.board.model.entity.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardRepository boardRepository;
	
	/**
     * 게시글 생성
     */
    @Transactional
    public Long save(final BoardRequestDto params) {

        Board entity = boardRepository.save(params.toEntity());
        return entity.getSeq();
    }

    /**
     * 게시글 리스트 조회
     */
    public List<BoardResponseDto> findAll() {

        Sort sort = Sort.by(Direction.DESC, "seq", "regDate");
        List<Board> list = boardRepository.findAll(sort);
        return list.stream().map(BoardResponseDto::new).collect(Collectors.toList());
    }

    /**
     * 게시글 수정
     */
    @Transactional
    public Long update(final Long seq, final BoardRequestDto params) {

        Board entity = boardRepository.findById(seq).orElseThrow();
        entity.update(params.getTitle(), params.getContent(), params.getWriter());
        return seq;
    }
}
