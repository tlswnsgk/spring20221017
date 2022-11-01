package org.zerock.mapper.board;

import java.util.List;

import org.zerock.domain.board.BoardDto;

public interface BoardMapper {

	// mapper 인터페이스
	// 이미 작성된 빈 클래스를 import
	
	int insert(BoardDto board);

	List<BoardDto> list(int offset, int records);

	BoardDto select(int id);

	int update(BoardDto board);

	int delete(int id);

	int countAll();

}
