package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.entity.User;

@RestController
public class UserController {
	@Autowired
	UserService userService ; //Dependency injection
	@PostMapping("/user") //REST end point
	public String create(@RequestBody User user){
		return userService.createUser(user);
	}
	@PutMapping("/user")
	public void update(@RequestBody User user) {
		userService.update(user);
	}
}
