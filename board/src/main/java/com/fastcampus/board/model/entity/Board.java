package com.fastcampus.board.model.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "board")
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
	
	@Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime regDate;
	
	@Column(columnDefinition = "bigint default 0")
	private Long cnt;
	
	@Builder
    public Board(Long seq, String writer, String title, String content, LocalDateTime regDate, Long cnt) {
        this.seq = seq;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regDate = LocalDateTime.now();
        this.cnt = cnt;
    }
	
}
