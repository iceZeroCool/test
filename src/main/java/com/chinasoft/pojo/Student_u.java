package com.chinasoft.pojo;

public class Student_u {
	private int id;
	private String stu;
	private String pwd;
	private String phone;
	private String address;
	private String email;
	private int c_id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return stu;
	}
	public void setUser(String user) {
		this.stu = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCid() {
		return c_id;
	}
	public void setCid(int cid) {
		this.c_id = c_id;
	}
	public Student_u(int id, String stu, String pwd, String phone, String address, String email, int class_id) {
		super();
		this.id = id;
		this.stu = stu;
		this.pwd = pwd;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.c_id = class_id;
	}
	public Student_u() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", stu=" + stu + ", pwd=" + pwd + ", phone=" + phone + ", address=" + address
				+ ", email=" + email + ", c_id=" + c_id+"]";
	}

	
	
	
}
