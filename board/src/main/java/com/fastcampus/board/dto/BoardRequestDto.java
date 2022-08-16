package com.fastcampus.board.dto;

import com.fastcampus.board.model.entity.Board;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardRequestDto {
    private String title;
    private String content;
    private String writer;
    private Long cnt;
    
    public Board toEntity() {
    	return Board.builder()
    			.title(title)
    			.writer(writer)
    			.content(content)
    			.cnt(0L)
    			.build();
    }
    
}
	