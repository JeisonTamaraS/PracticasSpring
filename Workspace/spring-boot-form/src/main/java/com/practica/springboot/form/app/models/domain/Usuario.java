package com.practica.springboot.form.app.models.domain;

import jakarta.validation.constraints.NotEmpty;

public class Usuario {
	
	@NotEmpty
	private String usename;
	@NotEmpty
	private String password;
	@NotEmpty
	private String email;
	
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
