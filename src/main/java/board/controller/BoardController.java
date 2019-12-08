package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.dto.BoardDto;
import board.service.BoardService;

@Controller
public class BoardController {

	@Autowired  
	private BoardService boardService;
	
	@RequestMapping("/board/openBoardList.do") //List Page
	public ModelAndView openBoardList() throws Exception{
		
		ModelAndView mv = new ModelAndView("/board/boardList");
		
		List<BoardDto> list = boardService.selectBoardList();
		mv.addObject("list", list);
		
		return mv;
	}

	@RequestMapping("/board/openBoardWrite.do") //Write Page
	public String openBoardWrite() throws Exception{
		return "/board/boardWrite";
	}
	
	@RequestMapping("/board/insertBoard.do") //Write
	public String insertBoard(BoardDto boardDto) throws Exception{
		boardService.insertBoard(boardDto);
		return "redirect:/board/openBoardList.do";
	}
	
	@RequestMapping("/board/openBoardDetail.do") //Detail Page
	public ModelAndView openBoardDetail(@RequestParam int boardIdx) throws Exception{
		ModelAndView mv = new ModelAndView("/board/boardDetail");
		
		BoardDto board = boardService.selectBoardDetail(boardIdx);
		mv.addObject("board", board);
		
		return mv;
	}
	
	@RequestMapping("/board/updateBoard.do") //Update
	public String updateBoard(BoardDto board) throws Exception{
		boardService.updateBoard(board);
		return "redirect:/board/openBoardList.do";
	}
	
	@RequestMapping("/board/deleteBoard.do") //Delete
	public String deleteBoard(int boardIdx) throws Exception{
		boardService.deleteBoard(boardIdx);
		return "redirect:/board/openBoardList.do";
	}
	
}
