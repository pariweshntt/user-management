package com.nttdata;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.nttdata.entity.User;

@Service
public class UserService {
	public String createUser(User user) {
		System.out.println("user="+user);
		return "success";
	}
}
