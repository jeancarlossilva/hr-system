package br.com.jean.userapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jean.userapi.domain.User;

@Repository
public interface UserRepositroy extends JpaRepository<User, Long> {

}
