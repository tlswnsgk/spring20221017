package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.lecture.JavaBean01;
import org.zerock.domain.lecture.JavaBean02;
import org.zerock.domain.lecture.Student;

@Controller
@RequestMapping("ex18")
public class Controller18 {
	
	// /ex18/sub01?name=park&address=seoul&email=abc@daum.net
	@RequestMapping("sub01")
	public void method01(@ModelAttribute("bean")JavaBean01 b) {
		
	}
	
	// @ModelAttribute 사용 bean2 라는 이름의 attribute를 model에 추가
	// bean2 타입은 JavaBean2
	// /ex18/sub02?name=son&age=30&password=asdf&email=abc@daum.net
	@RequestMapping("sub02")
	public void method2(@ModelAttribute("beaa") JavaBean02 b) {
		b.setAge(30);
		b.setEmail("asd@asd.net");
		b.setName("son");
		b.setPassword("asdasd");
	}
	
	@RequestMapping("sub03")
	public void method3(@ModelAttribute Student s) {
		s.setClassName("soccer");
		s.setName("cha");
		
	}
	@RequestMapping("sub04")
	public String method4(Student s) {
		s.setClassName("football");
		s.setName("son");
		
		return "ex18/sub03";
		
	}
}
