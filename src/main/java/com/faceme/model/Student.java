package com.faceme.model;

import java.util.Date;

public class Student {
	private Long id;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", userName=" + userName + ", firstName="
				+ firstName + ", lastName=" + lastName + ", password="
				+ password + ", emailAddress=" + emailAddress
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	private String userName;

	private String firstName;

	private String lastName;
	
	private String password;
	
	private String emailAddress;
	
	private Date dateOfBirth;
}
