package com.binodsh.um1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
@RequestMapping("/")
	public String openLoginPage() {
		return "login";
	}
}
