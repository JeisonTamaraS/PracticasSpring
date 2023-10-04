package com.practica.springboot.form.app.models.domain;

import java.util.Date;

import com.practica.springboot.form.app.validation.IdentificadorRegex;
import com.practica.springboot.form.app.validation.Requerido;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Usuario {
	//con la etiqueta @pattern validaremos el patron en el identificador 
	//@Pattern(regexp = "[0-9]{2}[.][//d]{3}[.][//d]{3}[-][A-Z]{1}")
	@IdentificadorRegex//validacion con anotacion creada por nosotros
	private String identificador;
	//@NotEmpty(message = "esta casilla no puede estar vacia")
	private String nombre;
	//@NotEmpty
	@Requerido//validamos con la anotacion creada
	private String apellido;
	@NotBlank
	@Size(min = 3, max = 8)
	private String usename;
	@NotEmpty
	private String password;
	@NotEmpty
	@Email
	private String email;
	@NotNull
	@Min(5)
	@Max(5000)
	private Integer cuenta;
	@NotNull
	private Date fechaNacimiento;
	
	public Integer getCuenta() {
		return cuenta;
	}
	public void setCuenta(Integer cuenta) {
		this.cuenta = cuenta;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
