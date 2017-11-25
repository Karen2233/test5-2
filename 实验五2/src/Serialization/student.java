package Serialization;

import java.io.Serializable;

public class student implements Serializable{
private static final long version=123l;
private String number;
private String sex;
private String name;
public student() {
}
public student(String number,String sex,String name) {
	this.name=name;
	this.number=number;
	this.sex=sex;
}
public String getName() {
	return this.name;
}
public String getNumber() {
	return this.number;
}
public String getSex() {
	return this.sex;
}
}
