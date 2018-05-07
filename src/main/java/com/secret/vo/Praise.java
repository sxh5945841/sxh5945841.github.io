package com.secret.vo;

import java.util.Date;

public class Praise {
 private Secret s;
 private User u;
 private Integer praise;
 private Date praiseTime;
 public Praise() {
	// TODO Auto-generated constructor stub
}
 
public Praise(Secret s, User u, Integer praise, Date praiseTime) {
	super();
	this.s = s;
	this.u = u;
	this.praise = praise;
	this.praiseTime = praiseTime;
}

public Secret getS() {
	return s;
}
public void setS(Secret s) {
	this.s = s;
}
public User getU() {
	return u;
}
public void setU(User u) {
	this.u = u;
}
public Integer getPraise() {
	return praise;
}
public void setPraise(Integer praise) {
	this.praise = praise;
}
public Date getPraiseTime() {
	return praiseTime;
}
public void setPraiseTime(Date praiseTime) {
	this.praiseTime = praiseTime;
}
 
}
