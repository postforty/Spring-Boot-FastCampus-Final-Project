package com.fastcampus.board.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.fastcampus.board.repository.Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final Repository repository;
	
	@GetMapping("/")
    public String list(){
        return "board/list";
    }
}
