package com.winterfell.athena.entity;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {
	private static final long serialVersionUID = 5862758996540233508L;
	private String phone;
	private String password;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
