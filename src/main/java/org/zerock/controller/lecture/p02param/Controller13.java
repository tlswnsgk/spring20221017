package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean01;
import org.zerock.domain.lecture.JavaBean02;
import org.zerock.domain.lecture.JavaBean03;

@Controller
@RequestMapping("ex13")
public class Controller13 {
	// /ex13/sub01?name=park&address=seoul
	@RequestMapping("sub01")
	public void method1(JavaBean01 bean1) {
		System.out.println("method11");
		
		System.out.println(bean1.getName());
		System.out.println(bean1.getAddress());
		System.out.println(bean1.getEmail());
	}
	@RequestMapping("sub02")
	public void method2(JavaBean02 bean2) {
		System.out.println(bean2);
	}
	@RequestMapping("sub03")
	public void method3(JavaBean03 param) {
		System.out.println(param);
	}
	

}















