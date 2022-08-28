package com.project.userfeedback.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//to rename the table name we use name as the parameter
@Table(name="feedbacktabel")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//to rename the column name we use @colunm attribute
	@Column(name="user_id")
	private int id;
	
	private String firstname;

	private String lastname;

	private String email;

	private String Subject;
	
	
	public User(int id, String firstname, String lastname, String email, String subject) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		Subject = subject;
	}


	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSubject() {
		return Subject;
	}


	public void setSubject(String subject) {
		Subject = subject;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", Subject=" + Subject + "]";
	}
	
	
}