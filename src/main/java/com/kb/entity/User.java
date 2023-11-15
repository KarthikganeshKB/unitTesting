package com.kb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User 
{
	
	private String name;
	@Id
	private int id;
	private double sal;	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
}
