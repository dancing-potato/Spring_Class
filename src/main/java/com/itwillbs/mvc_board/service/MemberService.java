package com.itwillbs.mvc_board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.mvc_board.mapper.MemberMapper;
import com.itwillbs.mvc_board.vo.MemberVO;

@Service
public class MemberService {
	// SQL 구문 실행을 담당할 XXXMapper.xml 파일과 연동되는 XXXMapper 객체 자동 주입 설정
	// MemberMapper 객체 자동 주입을 위한 어노테이션 설정
	@Autowired
	private MemberMapper mapper;

	// 회원 가입 joinMember() 메서드
	// => 파라미터 : MemberVO 객체   리턴타입 : int(insertCount)
	public int joinMember(MemberVO member) {
//		System.out.println("MemberService - joinMember");
		// Mapper 객체의 메서드 호출하여 SQL 구문 실행 요청(DAO 객체 없이도 실행)
		// => Mapper 객체의 메서드 실행 후 리턴되는 값을 직접 return 문에 사용하도록
		//    메서드 호출 코드 자체를 return 문 뒤에 바로 작성
		//    (리턴값이 없을 경우 메서드 호출만 기술)
		// => 단, 메서드 호출 후에도 추가 작업이 필요한 경우 메서드 호출과 리턴을 분리
		return mapper.insertMember(member);
	}

	// 로그인 loginMember() 호출
	// => 파라미터 : MemberVO 객체, 리턴타입 : MemberVO
	public MemberVO loginMember(MemberVO member) {
		return mapper.loginMember(member);
	}
	
}













