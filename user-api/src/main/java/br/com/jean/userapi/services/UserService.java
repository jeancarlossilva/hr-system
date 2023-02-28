package br.com.jean.userapi.services;

import java.util.List;

import br.com.jean.userapi.domain.User;

public interface UserService {

	User findById(Long id);
	List<User> findAll();
}
