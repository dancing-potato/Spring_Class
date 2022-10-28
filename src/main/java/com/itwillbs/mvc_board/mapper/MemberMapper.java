package com.itwillbs.mvc_board.mapper;

import com.itwillbs.mvc_board.vo.MemberVO;

// Service 객체에서 사용할(호출할) 메서드 형태를 추상메서드로 정의(DAO 클래스 대신 사용)
// => 정의된 추상메서드는 XML 파일(XXXMapper.xml) 에서 연결되어 활용됨
// => 주의! 추상메서드 이름과 XML 파일에서의 id 속성값이 같아야 함!
public interface MemberMapper {
	// 1. 회원 가입에 필요한 insertMember() 메서드 정의
	// => 파라미터 : MemberVO 객체(member), 리턴타입 : int
	public int insertMember(MemberVO member);

	// 2. 로그인에 필요한 loginMember() 메서드 정의
	public MemberVO loginMember(MemberVO member);
	
	
}














