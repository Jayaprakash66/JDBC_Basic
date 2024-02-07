package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class person {
	@Id
	private int pid;
	private String name;
	private int age;
	private String gender;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "person [pid=" + pid + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
