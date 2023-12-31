package com.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.start.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	public User findByEmail(String emaill);

	public User findByVerificationCode(String code);
	
}
