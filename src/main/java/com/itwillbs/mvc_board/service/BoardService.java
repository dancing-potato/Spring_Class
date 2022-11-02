package com.itwillbs.mvc_board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.mvc_board.mapper.BoardMapper;
import com.itwillbs.mvc_board.vo.BoardVO;

@Service
public class BoardService {
	@Autowired
	private BoardMapper mapper;

	// 글 쓰기
	public int registBoard(BoardVO board) {
		return mapper.insertBoard(board);
	}

	// 전체 글 목록 갯수 조회
	// => 파라미터 : 없음, 리턴타입 : int(listCount)
	public int getBoardListCount() {
		return mapper.selectBoardListCount();
	}

	// 게시물 목록 조회
	// => 파라미터 : 시작행번호, 페이지 당 목록 갯수, 리턴타입 : List<BoardVO>(boardList)
	public List<BoardVO> getBoardList(int startRow, int listLimit) {
		return mapper.selectBoardList(startRow, listLimit);
	}
	
}











