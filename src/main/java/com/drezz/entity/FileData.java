package com.drezz.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="file_tbl")
public class FileData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer fId;
	public String fname;
	private Float fbill;
	private Date createdDate;
	public Integer getfId() {
		return fId;
	}
	public void setfId(Integer fId) {
		this.fId = fId;
	}
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
	public FileData(Integer fId, String fname, Float fbill, Date createdDate) {
		this.fId = fId;
		this.fname = fname;
		this.fbill = fbill;
		this.createdDate = createdDate;
	}
	public FileData() {
		
	}
	
	
}
