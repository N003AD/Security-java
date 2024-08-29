package com.ctd.security.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "users")
public class UserEntity implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fisrtName", length= 250, nullable = false )
	private String firstName;
	@Column(name = "lastName", length = 250, nullable = false) 
	private String lastName;
	@Column(name = "email", length = 250, nullable = false, unique = true)
	private String email;
	public UserEntity(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public UserEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
