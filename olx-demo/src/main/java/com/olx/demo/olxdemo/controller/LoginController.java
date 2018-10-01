package com.olx.demo.olxdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
@GetMapping("/login")

String Login(){
	return "LoginForm";
}
}
