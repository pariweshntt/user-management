package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.nttdata.entity.User;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public String createUser(User user) {
		System.out.println("user="+user);
		userRepository.save(user);
		return "success";
	}

	public void update(User user, Integer id ) {
		System.out.println("user="+user);
		user.setId(id);
		userRepository.save(user);
	}
}
