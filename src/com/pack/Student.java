package com.pack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;



@Entity
public class Student {
@Id
private int sno;
@Column(name="sname")
private String sname;
private int marks;
public int getSno() {
	return sno;
}
public void setSid(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}

}
