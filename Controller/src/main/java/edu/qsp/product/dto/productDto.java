package edu.qsp.product.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class productDto {
	@Id
	private int pid;
	private String name;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "productDto [pid=" + pid + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}
