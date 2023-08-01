package kr.co.dao;

import java.util.List;

import kr.co.vo.BoardVO;

public interface BoardDAO { // 인터페이스
	
	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
	// 게시글 조회
	public List<BoardVO> list() throws Exception;
	
	// 게시글 상세 조회 
	public BoardVO read(int bno) throws Exception;
	
}
