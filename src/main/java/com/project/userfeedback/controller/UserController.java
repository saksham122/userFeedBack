package com.project.userfeedback.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.userfeedback.entities.User;
import com.project.userfeedback.services.UserService;




@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// get all the user feedback
	@GetMapping("/user")
	public ResponseEntity<List<User>> getUsers() {

		List<User> list = userService.getAllUser();

		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);

	}

	// get Single user
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") int id) {
		User user = userService.getUserById(id);
		if (user == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(user));
	}
	
	//add user to the database 
	@PostMapping("/user")
	public ResponseEntity<User> adduser(@RequestBody User user) {
		User u = null;
		try {
			u = this.userService.adduser(user);
			System.out.println(u);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}
	
	//delete the user feedback by id 
	@DeleteMapping("/user/{userid}")
	public void deleteUser(@PathVariable("userid") int userid) {

		this.userService.deleteUser(userid);
	}
	
	//updating the user feedback 
	@PutMapping("/user/{userid}")
	public User updateUser(@RequestBody User user, @PathVariable("userid") int userid) {
		this.userService.updateUser(user, userid);
		return user;
	}
	//Handling the form 
	@RequestMapping(value = "/formhandeler", method = RequestMethod.POST)
	public String userInfo(User use) {
		userService.adduser(use);

		return "thanku";
	}



}