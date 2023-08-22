package com.tut.hbMaven;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
//@Table(name="StudentsData") to change table name we use this
public class StudentReg{

private int id;
private String name;
private String city;

public StudentReg() {
	}
public StudentReg(int id,String name,String city) {
	// TODO Auto-generated constructor stub
	super();
	this.id = id;
	this.name = name;
	this.city = city;

}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "StudentReg [id=" + id + ", name=" + name + ", city=" + city + "]";
}



}
