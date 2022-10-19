package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex04")
public class Controller04 {

	@RequestMapping("sub01")
	public void method1() {
		System.out.println("메소드01 일!!!");
	}

	@RequestMapping(value = "sub02", method = RequestMethod.GET)
	public void method2() {
		System.out.println("메소드02 일!!!");
	}
	
	@RequestMapping(value = "sub02", method = RequestMethod.POST)
	public void method3() {
		System.out.println("메소드03 일!!!");
	}
	
	@RequestMapping(value = "sub03",method = {RequestMethod.GET,RequestMethod.POST})
	public void method4() {
		System.out.println("method44444");
	}
	//요청 경로 :/ex04/sub04 방식 : get,post
	@RequestMapping(value = "sub04", method = {RequestMethod.GET,RequestMethod.POST})
	public void method5() {
		System.out.println("method55");
	}
		
	@RequestMapping(value = "sub05",method = {RequestMethod.GET,RequestMethod.POST})
	public void method6() {
		System.out.println("method66");
	}
	}
	












