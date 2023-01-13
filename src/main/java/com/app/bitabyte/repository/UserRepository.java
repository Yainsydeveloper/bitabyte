package com.app.bitabyte.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bitabyte.entity.User;






@Repository("userRepository")
public interface UserRepository  extends JpaRepository<User, Serializable> {

	List<User> findByCorreoAndPassword(String correo, String password);
	
	

}