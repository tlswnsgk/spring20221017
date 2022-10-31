package org.zerock.domain.board;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDto {
	//게시판 자바 빈
	private int id;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime inserted;
}
