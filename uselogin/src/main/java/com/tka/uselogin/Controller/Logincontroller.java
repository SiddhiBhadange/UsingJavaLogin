package com.tka.uselogin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.tka.userlogin.user.Login;


@Controller
public class Logincontroller {

	@GetMapping("openloginpage")
	public String user(){
		return "login";
	}
	
	@GetMapping("logincheck")
	public String login(@ModelAttribute Login login, Model model){
		if(login.getUsername().equals("tka")) {
			model.addAttribute("msg","correct");
		}else {
			model.addAttribute("msg","wrong");
		}
		return "login";
	}
}
