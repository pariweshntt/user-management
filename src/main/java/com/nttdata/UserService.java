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
		checkName(user);
		userRepository.save(user);
		return "success";
	}

	private void checkName(User user) {
		if(user.getName()==null || user.getName().isEmpty())
		{
			throw new IllegalArgumentException("Name is must");
		}
	}

	public void update(User user, Long id ) {
		System.out.println("user="+user);
		checkName(user);
		user.setId(id);
		userRepository.save(user);
	}
}
