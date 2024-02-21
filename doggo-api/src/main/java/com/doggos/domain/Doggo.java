package com.doggos.domain;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DOGGOS")
public class Doggo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public
	Long id;
	
	@Column(name = "DOGGO_NAME")
	public
	String name;
	
	public Doggo() {}
	
	public Doggo(String name) {
		this.setName(name);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
