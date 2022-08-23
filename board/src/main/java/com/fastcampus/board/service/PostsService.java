package com.fastcampus.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fastcampus.board.dto.PostsSaveRequestDto;
import com.fastcampus.board.model.entity.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostsService {
	private final BoardRepository boardRepository;
	
	@Transactional
	public Long save(PostsSaveRequestDto requestDto) {
		return boardRepository.save(requestDto.toEntity()).getSeq();
	}

}
