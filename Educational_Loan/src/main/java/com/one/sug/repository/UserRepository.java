package com.one.sug.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.sug.model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{
	public UserModel findByEmail(String email);
}

