package com.project.userfeedback.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.userfeedback.entities.User;





public interface UserRepository extends CrudRepository<User, Integer> {

	public User findById(int id);

}