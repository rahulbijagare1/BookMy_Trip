package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto)
	{
		
		UserDto  createUserDto = this.userService.createUser(userDto);
		
		return new ResponseEntity<>(createUserDto,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto,@PathVariable("userId") Long uid)
	{
		UserDto updatedUser = this.userService.updateUser(userDto, uid);
		return ResponseEntity.ok(updatedUser);
		
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Long uid)
	{
		this.userService.deleteUser(uid);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Succsessfully",true),HttpStatus.OK);
		
	}

	
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers()
	{
		
		return ResponseEntity.ok(this.userService.getAllUsers());
		
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable Long userId)
	{
		
		return ResponseEntity.ok(this.userService.getUserById(userId));
		
		
	}
}
