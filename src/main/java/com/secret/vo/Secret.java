package com.secret.vo;

import java.util.Date;

public class Secret {
 private Integer id;
 private User user;
 private String content;
 private Date createTime;


public Secret() {
	// TODO Auto-generated constructor stub
}
public Secret(Integer id, User user, String content, Date createTime) {
	super();
	this.id = id;
	this.user = user;
	this.content = content;
	this.createTime = createTime;
}



public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}

public Date getCreateTime() {
	return createTime;
}

public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
 
}
