package com.sist.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class MainController {
	
	@GetMapping("main/main.do")
	public String main_page(Model model)
	{
		return "main";
	}
}
