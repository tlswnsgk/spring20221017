package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex07")
public class Controller07 {

	@GetMapping("sub01")
	public void method1() {
		System.out.println("method11111");
	}
	
	@GetMapping(value = "sub01",params = "name")
	public void method2() {
		System.out.println("method222");
	}
	//Get 방식 sub02
	@GetMapping("sub02")
	public void method3() {
		System.out.println("method333");
	}
	
	//Get 방식 sub02 request param address 
	@GetMapping(value = "sub02",params = "address")
	public void method4() {
		System.out.println("method444");
	}
	@GetMapping(value = "sub03",params = "address=seoul")
	public void method5() {
		System.out.println("method555");
	}
	@GetMapping(value = "sub03")
	public void method6() {
		System.out.println("method666");
	}
	
	@GetMapping("sub04")
	public void method7() {
		System.out.println("method77");
		
	}
	@GetMapping(path = "sub04",params= {"name","age"})
	public void method8() {
		System.out.println("method888");
	}
	
}







