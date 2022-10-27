package com.itwillbs.mvc_board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.itwillbs.mvc_board.service.MemberService;

@Controller
public class MemberController {
	// Service 객체를 직접 생성하지 않고, 자동 주입 기능을 위한 어노테이션 사용
	// => @Inject(자바-플랫폼 공용) 또는 @Autowired(스프링 전용) 어노테이션 사용 가능
	// => 어노테이션 지정 후 자동 주입으로 객체를 생성하면 저장될 클래스 타입 변수 선언
	// => 단, 해당 클래스는 반드시 어노테이션을 통해 역할이 지정되어야 한다!
	@Autowired
	private MemberService service;
	
	// "/MemberJoinForm.me" 요청에 대해 member/member_join_form.jsp 페이지 실행
	@GetMapping(value = "/MemberJoinForm.me")
	public String join() {
		return "member/member_join_form";
	}
	
	// "/MemberJoinPro.me" 요청에 대해 비즈니스 로직 처리할 joinPro() 메서드 정의 - POST
	@PostMapping(value = "/MemberJoinPro.me")
	public String joinPro() {
		// MemberService 객체의 joinMember() 메서드 호출
//		MemberService service = new MemberService();
		service.joinMember();
		
		return "redirect:/";
	}
	
	
	// "/MemberLoginForm.me" 요청에 대해 member/member_login_form.jsp 페이지 실행
	@GetMapping(value = "/MemberLoginForm.me")
	public String login() {
		return "member/member_login_form";
	}
	
}
