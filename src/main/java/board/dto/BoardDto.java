package board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {

	private int boardIdx;
	
	private String title;
	
	private String contents;
	
	private int hitCnt;
	
	private String creatorId;
	
	private String createdDatetime;
	
	private String updaterId;
	
	private String updatedDatetime;

}
