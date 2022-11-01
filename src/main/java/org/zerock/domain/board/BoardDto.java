package org.zerock.domain.board;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardDto {
	//게시판 자바 빈
	// lombok을 이용해서 생성자와 toString등을 만들어 내는 방식을 사용
	//@Data 어노테이션 적용
	private int id;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime inserted;
}
