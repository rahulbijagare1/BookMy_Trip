package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.entities.User.UserType;

public interface UserService {

	UserDto createUser(UserDto user);
	UserDto updateUser( UserDto user,Long userId);
	UserDto getUserById(Long userId);
	UserDto getUserByUserType(UserType userType);
	List<UserDto> getAllUsers();
	void deleteUser(Long userId);
	void deleteUserByUserType(UserType userType);
	
	
}
