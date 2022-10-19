package org.zerock.controller.lecture.p03forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex15")
public class Controller15 {

	// ex15/sub01
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("method1 11");
	}
	
	//sub02 요청 /WEB-INF/views/ex15/sub02.jsp로 포워드
	
	@RequestMapping("sub02")
	public void method2() {
		System.out.println("method2");
	}
	
	@RequestMapping("sub03")
	public String method3() {
		
		// void처럼 default view name을 사용해서 view로 포워드
		return null; 
		
	}
	
	// sub04 /WEB-INF/view/ex15/sub04.jsp 포워드
	@RequestMapping("sub04")
	public String method4() {
		return null;
	}
	// sub05 name request param이 있으면 /WEB-INF/views/ex15/sub051.jsp로 포워드 
	// 없으면 /WEB-INF/views/ex15/sub0.jsp로 포워드
	@RequestMapping("sub05")
	public String method5(String name) {
		if(name == null) {
			return null;
		}
		return "ex15/sub051";
	}
	// sub06 address request param이 있으면 /WEB-INF/views/ex15/sub061.jsp forward
	// 없으면 /WEB-INF/views/ex15/sub06.jsp forward
	@RequestMapping("sub06")
	public String method6(String address) {
		if(address == null) {
			return null;
		}
		return "ex15/sub061";
	}
	
	@RequestMapping(value = "sub07",params = "address")
	public String method7() {
		return "ex15/sub071";
	}
	@RequestMapping("sub07")
	public void method8() {
		
	}
	
	
	
	
	
	
	
}
