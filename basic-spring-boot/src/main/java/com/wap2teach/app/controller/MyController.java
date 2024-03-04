package com.wap2teach.app.controller;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import net.bytebuddy.dynamic.scaffold.MethodGraph.NodeList;

@Controller
public class MyController {
	
	//http://localhost:8080/about
	
	@GetMapping("/about")
	public String getAbout()
	{
		System.out.println("About");
		return "about";
	}
	
	@GetMapping("/getdata")
	public String getData(Model model)
	{
		System.out.println("getdata");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(9);
		list.add(15);
		list.add(18);
		list.add(4);
		list.add(2);
		model.addAttribute("data", 34);
		return "get-data";
	}
}
