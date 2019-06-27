package com.nttdata;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.nttdata.entity.User;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Transactional
	public void createUser(User user) throws Exception {
//		if(user.getSalary() <1000) {
//			throw new IllegalArgumentException("Salary cannot be <1000");
//		}
		userRepository.save(user);
//		throw new RuntimeException();
		
//		return "success";
	}

	public void update(User user, Long id ) {
		System.out.println("user="+user);
		user.setId(id);
		userRepository.save(user);
	}
}
