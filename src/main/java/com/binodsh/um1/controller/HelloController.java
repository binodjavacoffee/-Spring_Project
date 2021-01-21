package com.binodsh.um1.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {
	
	@RequestMapping("/buddha")
	public ModelAndView sayBye() {
		ModelAndView view = new ModelAndView("hello");
	//	view.addObject("msg", "hello, what's up man?");
		return view;
	
	
	}
	
	
	@RequestMapping("/namaskar")
public ModelAndView sayNamaste() {
	ModelAndView view = new ModelAndView("namaste");
	view.addObject("msg", "hello, what's up man?");
	return view;
	
} 
	@RequestMapping ("/message/{first_name}")
	public ModelAndView message (@PathVariable("first_name" )String firstName) {
		ModelAndView view=new ModelAndView("namaste");
		view.addObject("msg","Malai thikai cha."+ firstName + " timro k cha halkhabar?" );
		return view;
		//while run this on server type name /message/(with any name)
	}
	@RequestMapping ("/message1/{first_name}/{lastName}")
	public ModelAndView message1 (@PathVariable("first_name" )String firstName,@PathVariable String lastName) {
		ModelAndView view=new ModelAndView("namaste");
		view.addObject("msg","Malai thikai cha saathi."+ firstName +" "+lastName+ " timro k cha halkhabar?" );
		return view;
		
		//while run this on server type name /message1/(with first and last name)
	}

	@RequestMapping ("/message2/{first_name}/{last_name}")
	public ModelAndView message2 (@PathVariable Map<String, String > info ){
		ModelAndView view=new ModelAndView("namaste");
		view.addObject("msg","where have u been?."+ info.get("first_name") +" "+ info.get("last_name")+ " Its very hard to learn java at this stage of life." );
		return view;
}
	@RequestMapping ("/message3")
	public ModelAndView message3(@RequestParam ("first_name")String firstName,@RequestParam String lastName){
		ModelAndView view=new ModelAndView("namaste");
		view.addObject("msg","I wish I can learn java at a fast pace."+ firstName +" "+ lastName+ " Its very hard to learn java at this stage of life." );
		return view;
		
		//run like this =http://localhost:8080/user-management1/message3?first_name=binod&lastName=Kumar
}
	@RequestMapping ("/message4")
	public ModelAndView message4(@RequestParam Map<String, String > info ){
		ModelAndView view=new ModelAndView("namaste");
		view.addObject("msg","where have u been?."+ info.get("first_name") +" "+ info.get("last_name")+ " Its very hard to learn java at this stage of life." );
		return view;
		//http://localhost:8080/user-management1/message4?first_name=binod&last_name=Kumar
	}
	//this is html practice
	@RequestMapping("/html")
	public ModelAndView sayHtml() {
		ModelAndView view = new ModelAndView("htmlpractice");
	//	view.addObject("msg", "hello, what's up man?");
		return view;
}
}