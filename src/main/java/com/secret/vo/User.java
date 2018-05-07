package com.secret.vo;

import java.util.Date;


public class User {
	private Integer id;//用户id
	private String username;//用户名
	private String password;//用户密码
	private Integer age;//用户的年龄
	private String sex;//用户的性别
	private String img;//用户的头像
	private String telephone;//用户的电话
	private String email;//用户的邮箱
	private String ip;//用户的本机ip地址
	private Date currentTime;//用户的创建时间
   
    
	

	public User(Integer id, String username, String password, Integer age,
			String sex, String img, String telephone, String email, String ip,
			Date currentTime) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.img = img;
		this.telephone = telephone;
		this.email = email;
		this.ip = ip;
		this.currentTime = currentTime;
	}

	public Integer getId() {
		return id;
	}
 
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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
    
	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}
    
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String username, String password, Integer age,
			String sex, String img, String telephone, String email,
			Date currentTime) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.sex = sex;
		this.img = img;
		this.telephone = telephone;
		this.email = email;
		this.currentTime = currentTime;
	}

  
}
