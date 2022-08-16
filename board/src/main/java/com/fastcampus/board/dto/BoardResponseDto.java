package com.fastcampus.board.dto;

import java.time.LocalDateTime;

import com.fastcampus.board.model.entity.Board;

import lombok.Getter;

@Getter
public class BoardResponseDto {
	private Long seq;
	private String title;
    private String content;
    private String writer;
    private Long cnt;
    private LocalDateTime regDate;
    
    public BoardResponseDto(Board entity) {
        this.seq = entity.getSeq();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.writer = entity.getWriter();
        this.cnt = entity.getCnt();
        this.regDate = entity.getRegDate();
    }
    
}
