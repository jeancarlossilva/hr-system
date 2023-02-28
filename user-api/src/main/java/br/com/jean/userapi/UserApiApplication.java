package br.com.jean.userapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.jean.userapi.domain.User;
import br.com.jean.userapi.repositories.UserRepositroy;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepositroy userRepositroy;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User newUser = new User(null, "", "", "", 20.0);
		
		userRepositroy.save(newUser);
	}

}
