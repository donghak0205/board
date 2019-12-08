package board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import board.dto.BoardDto;

@Mapper
public interface BoardMapper {
	
	List<BoardDto> selectBoardList() throws Exception; //select
	
	void insertBoard(BoardDto boardDto) throws Exception; //insert
	
	BoardDto selectBoardDetail(int boardIdx) throws Exception;

	void updateHitCount(int boardIdx) throws Exception; //hit+1
	
	void updateBoard(BoardDto boardDto) throws Exception; //update
	
	void deleteBoard(int boardIdx) throws Exception; //delete
	
}
