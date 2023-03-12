package com.app.service;

import java.util.List;
import com.app.entities.User;

public interface IUserService {

	String registerUser(User TransientObject);

//	boolean updateUserDetails(User user);

//	String getUserRoleByEmail(String email);
	
//	public Integer getUserRegIDByEmail(String email);
	
	public List<User> getAllUsers();
	
	
}
