package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bid;
	private String name;
	private String edition;
	@ManyToOne
	private Author Author;
	public Author getAuthor() {
		return Author;
	}
	public void setAuthor(Author author) {
		Author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	
}
