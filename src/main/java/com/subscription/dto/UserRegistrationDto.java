package com.subscription.dto;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.subscription.constraint.FieldMatch;

@FieldMatch.List({
	@FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match"),
	@FieldMatch(first = "email", second = "confirmEmail", message = "The email fields must match")
})
public class UserRegistrationDto {


	@NotEmpty
	private String username;

	@NotEmpty
	private String age;

	@NotEmpty
	private String password;

//	@NotEmpty
//	private String confirmPassword;

	@Email
	@NotEmpty
	private String email;

//	@Email
//	@NotEmpty
//	private String confirmEmail;


//	@AssertTrue
//	private Boolean terms;


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


//	public String getConfirmPassword() {
//		return confirmPassword;
//	}
//
//
//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


//	public String getConfirmEmail() {
//		return confirmEmail;
//	}
//
//
//	public void setConfirmEmail(String confirmEmail) {
//		this.confirmEmail = confirmEmail;
//	}


//	public Boolean getTerms() {
//		return terms;
//	}
//
//
//	public void setTerms(Boolean terms) {
//		this.terms = terms;
//	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}

	
	

}
