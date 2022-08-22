package com.fastcampus.board.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;

	@Column(length = 200, nullable = false)
	private String title;
	
	@Column(length = 20, nullable = false)
	private String writer;
	
	@Column(length = 2000, nullable = false)
	private String content;
	
	@Column(nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime regDate;
	
	@Column(columnDefinition = "bigint default 0")
	private Long cnt;
	
	@Builder
	public Board(String title, String writer, String content, Long cnt) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.cnt = cnt;
	}
	
	public void update(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.regDate = LocalDateTime.now();
    }
}
