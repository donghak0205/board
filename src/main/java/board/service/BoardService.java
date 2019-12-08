package board.service;

import java.util.List;

import board.dto.BoardDto;

public interface BoardService {
	
	List<BoardDto> selectBoardList() throws Exception; //select
	
	void insertBoard(BoardDto boardDto) throws Exception; //insert
	
	BoardDto selectBoardDetail(int boardIdx) throws Exception; //Detail
	
	void updateBoard(BoardDto boardDto) throws Exception; //update
	
	void deleteBoard(int boardIdx) throws Exception; //delete
	
}
