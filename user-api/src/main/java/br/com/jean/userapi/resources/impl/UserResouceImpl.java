package br.com.jean.userapi.resources.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jean.userapi.domain.User;
import br.com.jean.userapi.resources.UserResource;
import br.com.jean.userapi.services.UserService;

@RestController
@RequestMapping(value = "/api/users")
public class UserResouceImpl implements UserResource {
	
	@Autowired
	private UserService userService;

	@Override
	public ResponseEntity<User> findById(Long id) {
		return ResponseEntity.ok(userService.findById(id));
	}

	@Override
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}

}
