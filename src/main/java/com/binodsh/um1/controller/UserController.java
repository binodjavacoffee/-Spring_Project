package com.binodsh.um1.controller;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import com.binodsh.um1.model.User;
import com.binodsh.um1.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String getUserForm() {
		return "createUser";
	}
	

	@RequestMapping(value = "/edit_user", method = RequestMethod.GET)
	public String getEditUserForm(@RequestParam int id ,Model model) {
		model.addAttribute("user", userService.getUserById(id));
		
		return "editUser";
	}

	// @RequestMapping(value="/save_user1",method=RequestMethod.POST)
	// public String saveUser(@RequestParam String userName,String password ,Model
	// model) {
//		System.out.println("user name is :" + userName);
//		System.out.println("password is " +password);
//		model.addAttribute("userName",userName);
//		model.addAttribute("password", password);
	// return"listUser";
	// this is one way of doing .
	// but as the data gets bigger it harder to do
	// there is other way with Map

	// @RequestMapping(value="/save_user",method=RequestMethod.POST)
	// public String saveUser(@RequestParam Map<String,String>info, Model model) {
//		System.out.println("user name is :" + info.get("username"));
//		System.out.println("password is :" +info.get("password"));
//		System.out.println("DOB is :" +info.get("dob"));
//		model.addAttribute("userName", info.get("username"));
	// model.addAttribute("password",password);s
	// we can do this by using Map
	// need to change the action if your select different one
	// it will be more difficult to do in Map if we have more datas so we use other
	// ways.
	// now we create a new file with model package and name called User and next way
	// to do in fine way
//		return"listUser";
	//
	// }

	@RequestMapping(value = "/save_user", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute User user) {
		userService.saveUser(user);

		/*
		 * once we add listuser no need of (model.addAttribute(attributeValue)) to bind
		 * while saving we can delete Model model and use list_user at a return value
		 * for redirect model.addAttribute("user", user); return "listUser";
		 */

		return "redirect:/list_user";
	}
	
	@RequestMapping(value = "/update_user", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute User user) {
		userService.updateUser(user);
		return "redirect:/list_user";
	}

	// to get data from the database
	@RequestMapping(value = "/list_user", method = RequestMethod.GET)
	public String getAllUser(Model model) {
		model.addAttribute("users", userService.getAllUser());
		// because of more than one data we use (s) on user
		return "listUser";
	}

	@RequestMapping(value = "/delete_user", method = RequestMethod.GET)
	public String deleteUser(@RequestParam int id) {
		userService.deleteUser(id);
		return "redirect:/list_user";
	}
}