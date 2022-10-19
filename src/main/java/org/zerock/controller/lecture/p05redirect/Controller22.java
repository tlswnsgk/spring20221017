package org.zerock.controller.lecture.p05redirect;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.JavaBean03;
import org.zerock.domain.lecture.Student;

@Controller
@RequestMapping("ex22")
public class Controller22 {

	@RequestMapping("sub01")
	public String method1(Model model) {
		model.addAttribute("name", "park ji sung");

		return "redirect:/ex22/sub02";
	}

	@RequestMapping("sub02")
	public void method2(Model model) {
		boolean hasName = model.containsAttribute("name");
		System.out.println(hasName);
	}

	@RequestMapping("sub03")
	public String method3(HttpSession session) {
		session.setAttribute("name", "park ji sung");

		return "redirect:/ex22/sub04";
	}

	@RequestMapping("sub04")
	public void method4(HttpSession session) {
		String name = (String) session.getAttribute("name");
		System.out.println(name);
	}

	// sub05 요청
	// /ex22/sub06 redirect
	// session에 attribute 넣는 코드 추가 (Student)
	@RequestMapping("sub05")
	public String method5(HttpSession session) {
		Student student = new Student();
		student.setClassName("soccer");
		student.setName("cha");
		student.setStudentNumber("11");

		session.setAttribute("student", student);

		return "redirect:/ex22/sub06";
	}

	@RequestMapping("sub06")
	public void method6(HttpSession session) {
		Student student = (Student) session.getAttribute("student");
		System.out.println(student.getName());
		System.out.println(student.getClassName());
		System.out.println(student.getStudentNumber());
	}

	// RedirectAttributes로 객체 넘기기
	@RequestMapping("sub07")
	public String method7(RedirectAttributes rttr) {
		Student student = new Student();
		student.setName("lee");
		student.setClassName("spring");
		student.setStudentNumber("99");

		rttr.addFlashAttribute("student", student);

		return "redirect:/ex22/sub08";
	}

	@RequestMapping("sub08")
	public void method8(Student student) {
		System.out.println(student);
	}

	// sub09요청 /ex22/sub10 리다이렉트
	// RedirectAttributes 사용해서 객체를 다음 요청에서 사용할 수 있게 전달
	// 객체 타입 : JavaBean03

	@RequestMapping("sub09")
	public String method8(RedirectAttributes rttr) {
		JavaBean03 javaBean03 = new JavaBean03();
		javaBean03.setAvg(55);
		javaBean03.setScore(50);
		javaBean03.setClassName("son");

		rttr.addFlashAttribute("javaBean03", javaBean03);

		return "redirect:/ex22/sub10";
	}
	@RequestMapping("sub10")
	public void method9(JavaBean03 javaBean03) {
		System.out.println(javaBean03);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
