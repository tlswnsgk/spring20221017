package org.zerock.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.BoardDto;
import org.zerock.mapper.board.BoardMapper;

@Service
public class BoardService {
	// Service :
	//mapper에게 일을 시키는 클래스 
	// return으로 일을 시킴
	
	@Autowired
	private BoardMapper mapper;
	
	public int register(BoardDto board) {
		//service는 mapper에게 일을 시킴
		return mapper.insert(board);
	}
	public List<BoardDto> listBoard() {
		// 
		return mapper.list();
	}
	
	public BoardDto get(int id) {
		// TODO Auto-generated method stub
		return mapper.select(id);
	}
	public int update(BoardDto board) {
		// TODO Auto-generated method stub
		return mapper.update(board);
	}
	public int remove(int id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}
	
}
