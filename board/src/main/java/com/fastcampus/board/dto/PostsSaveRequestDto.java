package com.fastcampus.board.dto;

import com.fastcampus.board.model.entity.Board;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
	private String title;
	private String content;
	private String writer;
	
	@Builder
	public PostsSaveRequestDto(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public Board toEntity() {
		return Board.builder()
				.title(title)
				.content(content)
				.writer(writer)
				.build();
	}
}
