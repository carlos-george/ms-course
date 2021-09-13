package br.com.til.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.til.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
