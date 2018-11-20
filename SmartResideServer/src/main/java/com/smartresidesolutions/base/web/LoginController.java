package com.smartresidesolutions.base.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartresidesolutions.base.model.UserDto;
import com.smartresidesolutions.base.services.UserService;

@RestController
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/status")
	public String getStatus() {
		return "Im Ready";
	}
	
	@PostMapping("/register")
	public UserDto registerUser(@RequestBody UserDto userDto) {
		
		userService.saveUser(userDto);
		
		return userDto;
	}
	
	@PostMapping("/getLoginData")
	@ResponseBody
	public UserDto getLoginUser(@RequestBody UserDto userDto) {
		
		userService.getUser(userDto);
		
		return userDto;
	}
	

}
