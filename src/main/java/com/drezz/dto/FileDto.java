package com.drezz.dto;

import java.util.Date;

public class FileDto {
	public String fname;
	private Float fbill;
	private Date createdDate;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Float getFbill() {
		return fbill;
	}
	public void setFbill(Float fbill) {
		this.fbill = fbill;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public FileDto(String fname, Float fbill, Date createdDate) {
		this.fname = fname;
		this.fbill = fbill;
		this.createdDate = createdDate;
	}
	public FileDto() {
		
	}
	
	
}
