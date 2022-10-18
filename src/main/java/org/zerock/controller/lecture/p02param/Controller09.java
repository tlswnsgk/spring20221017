package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex09")
public class Controller09 {

	// /ex09/sub01?address=seoul
	@GetMapping("sub01")
	public void method1(@RequestParam(name = "address") String a) {
		System.out.println(a);
	}
	
	// sub02 경로
	// get 방식
	// name request param를 받을 수 있는 @RequestParam
	@GetMapping("sub02")
	public void method2(@RequestParam(name = "name")String name) {
		System.out.println(name);
	}
	// name request param 받아서 출력 
	
	@GetMapping("sub03")
	public void method3(@RequestParam(value = "name")String name) {
		System.out.println(name);
	}
	@GetMapping("sub04")
	public void method4(@RequestParam("name")String name) {
		System.out.println(name);
	}
	// /ex09/sub05?name=donald&address=ny
	@GetMapping("sub05")
	public void method5(@RequestParam("name")String a,@RequestParam("address") String b) {
		System.out.println(a);
		System.out.println(b);
	}
	@GetMapping("sub06")
	public void method6(@RequestParam("q")String a, @RequestParam("age") int b) {
		System.out.println(a);
		System.out.println(b);
	}
	// /ex09/sub08?num1=10&num2=20
	@GetMapping("sub08")
	public void method8(@RequestParam("num1")int num1,@RequestParam("num2")int num2) {
		System.out.println(num1+num2);
	}
	// requestParam -> method param 바인딩 될 떄 
	// 자동 형변환되는 type : String, 기본타입(primitive).wrapper 
	
	// /ex09/sub09?a=seoul&b=6314&c=9.99&d=100&e=300
	@GetMapping("sub09")
	public void method9(@RequestParam("a")String a,@RequestParam("b")double b
			,@RequestParam("c")Double c,@RequestParam("d")int d,
			@RequestParam("e")Integer e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}









