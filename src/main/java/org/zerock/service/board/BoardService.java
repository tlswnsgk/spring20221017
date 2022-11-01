package org.zerock.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.board.BoardDto;
import org.zerock.domain.board.PageInfo;
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
	public List<BoardDto> listBoard(int page,PageInfo pageInfo) {
		int records = 10;
		int offset = (page-1)*records; // 페이지 식
		
		// 페이지 마지막 계산
		int countAll = mapper.countAll(); // SELECT COUNT(*) FROM Board
		int lastPage = (countAll-1)/records+1; // 페이지 식 
		
		int leftPageNumber = (page - 1) / 10 * 10 + 1;
		int rightPageNumber = leftPageNumber + 9;
		rightPageNumber = Math.min(rightPageNumber,lastPage);
		
		
		pageInfo.setCurrentPageNumber(page);
		pageInfo.setLeftPageNumber(leftPageNumber);
		pageInfo.setRightPageNumber(rightPageNumber);
		pageInfo.setLastPageNumber(lastPage);
		return mapper.list(offset,records);
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
