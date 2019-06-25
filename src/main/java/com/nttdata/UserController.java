package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.entity.User;

@RestController
public class UserController {
	@Autowired
	UserService userService; //Dependency injection
	@PostMapping("/user")
	public void createUser(@RequestBody User user){
		userService.createUser(user);
	}
}
