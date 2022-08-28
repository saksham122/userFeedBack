package com.project.userfeedback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.userfeedback.dao.UserRepository;
import com.project.userfeedback.entities.User;




@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// getting all the details from the user feedback database
	public List<User> getAllUser() {
		List<User> list = (List<User>) this.userRepository.findAll();
		return list;
	}

	// getting single user by id and also check the status of the code
	public User getUserById(int id) {
		User user = null;
		// i use try block to check the status code
		try {
			
			user = this.userRepository.findById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	//for adding the feedback to the database
	public User adduser(User u) {
		User result = userRepository.save(u);
		return result;
	}
	//update the user feedback
	public void updateUser(User user,int Userid) {
		
		user.setId(Userid);
		userRepository.save(user);
		
	}
	

	public void deleteUser(int userid) {
		
		userRepository.deleteById(userid);
	}


	
}