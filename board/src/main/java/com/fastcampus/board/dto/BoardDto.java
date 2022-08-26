package com.fastcampus.board.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

import com.fastcampus.board.model.entity.Board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
    private long seq;
    @NotEmpty
    private String title;
    @NotEmpty
    private String writer;
    @NotEmpty
    private String content;
    private LocalDateTime regDate;
    private Long cnt;
    
    public Board toEntity(Long cnt) {
        Board build = Board.builder()
                .seq(seq)
                .writer(writer)
                .title(title)
                .content(content)
                .regDate(regDate)
                .cnt(cnt)
                .build();
        return build;
    }
    
    @Builder
    public BoardDto(Long seq, String writer, String title, String content, LocalDateTime regDate, Long cnt) {
        this.seq = seq;
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.regDate = regDate;
        this.cnt = cnt;
    }
}
