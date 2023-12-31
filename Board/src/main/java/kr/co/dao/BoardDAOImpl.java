package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert",boardVO);
	}
	
	// 게시글 목록 조회
	@Override
	public List<BoardVO> list() throws Exception {
		// boardMapper.xml에서 mapper의 namespace가 boardMapper이고 id가 list인 것을 가져와 반환! 
		return sqlSession.selectList("boardMapper.list"); 
	}

	// 게시글 상세 조회
	@Override
	public BoardVO read(int bno) throws Exception {
		return sqlSession.selectOne("boardMapper.read",bno);
	}
	
	
}
