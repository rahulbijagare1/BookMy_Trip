package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entities.User;
import com.example.demo.entities.User.UserType;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		
		User user=this.dtoToUser(userDto);
		User savedUser=this.userRepo.save(user);
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Long userId) {
		
		User user=this.userRepo.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		
		user.setUsername(userDto.getUsername());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setUserType(userDto.getUserType());
		user.setId(userDto.getId());
		
		User updatedUser = this.userRepo.save(user);
		UserDto userDto1=this.userToDto(updatedUser);
		
		return userDto1;
	}

	@Override
	public UserDto getUserById(Long userId) {
		
		User user=this.userRepo.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		return this.userToDto(user);
	}

	@Override
	public UserDto getUserByUserType(UserType userType) {
		
		return null;
		
	}

	@Override
	public List<UserDto> getAllUsers() {
		List<User> users=this.userRepo.findAll();
		List<UserDto> userDtos = users.stream().map(user->this.userToDto(user)).collect(Collectors.toList());
		
		return userDtos;
	}

	@Override
	public void deleteUser(Long userId) {
		
		User user = this.userRepo.findById(userId)
		            .orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
		this.userRepo.delete(user);
	}

	@Override
	public void deleteUserByUserType(UserType userType) {
		// TODO Auto-generated method stub
		
	}
	public User dtoToUser(UserDto userDto)
	{
		User user=this.modelMapper.map(userDto,User.class);
		
		
		/*
		user.setId(userDto.getId());
		user.setUsername(userDto.getUsername());
		user.setEmail(userDto.getEmail());
		user.setUserType(userDto.getUserType());
		user.setPassword(userDto.getPassword());
		*/
		return user;
	}
	public UserDto userToDto(User user)
	{
		UserDto userDto= this.modelMapper.map(user, UserDto.class);
		
		
		/*
		userDto.setId(user.getId());
		userDto.setUsername(user.getUsername());
		userDto.setEmail(user.getEmail());
		userDto.setUserType(user.getUserType());
		userDto.setPassword(user.getPassword());
		*/
		return userDto;
		
	}

}
