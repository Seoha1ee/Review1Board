package kr.co.service;

import java.util.List;

import kr.co.vo.BoardVO;

public interface BoardService {
	
	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
	// 게시글 목록
	public List<BoardVO> list() throws Exception;
	
	// 게시글 상세 조회
	public BoardVO read(int bno) throws Exception;
}
