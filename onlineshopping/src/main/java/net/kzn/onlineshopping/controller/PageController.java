package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	@RequestMapping(value = {"/", "login"})
	public ModelAndView login(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "login");
		mv.addObject("userClickLogin", "true");
		return mv;
	}
	
	@RequestMapping(value = {"/home", "/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", "true");
		return mv;
	}
	
	
	@RequestMapping(value = "/example")
	public ModelAndView example(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "example");
		mv.addObject("userClickExample", "true");
		return mv;
	}
	
	/*@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting") String greeting){
		if(greeting==null)
		{
			greeting = "hello there";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
	
	/*@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value = "greeting", required = false)String greeting){
		if(greeting==null)
		{
			greeting = "hello there";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}*/

}
