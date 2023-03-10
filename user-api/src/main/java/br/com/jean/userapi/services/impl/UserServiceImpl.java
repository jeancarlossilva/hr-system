package br.com.jean.userapi.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.jean.userapi.domain.User;
import br.com.jean.userapi.repositories.UserRepositroy;
import br.com.jean.userapi.services.UserService;
import br.com.jean.userapi.services.exceptions.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepositroy repositroy;
	
	@Autowired
	private Environment env;

	@Override
	public User findById(Long id) {
		System.out.println("USER_API :: port " +  env.getProperty("local.server.port"));
		return repositroy.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
