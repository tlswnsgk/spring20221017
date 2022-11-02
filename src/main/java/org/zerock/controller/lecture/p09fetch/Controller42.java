package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex42")
public class Controller42 {

	@RequestMapping("sub")
	public void method0() {
		
	}
	// 같은 요청 방식,경로이지만 produces (Accept 설정으로 다른 메소드 호출 할 수 있다) 
	@GetMapping(path="sub01",produces ="text/plain")
	public void method1() {
		System.out.println("/ex42/sub01 메소드 일함");
	}
	@GetMapping(path="sub01",produces="text/html")
	public void method2() {
		System.out.println("/ex42/sub01 메소드 일함");
	}
	
	
	
	
	
	
	
}
