package com.damu.hibernate.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name="table_info")
public class Emp {
	@Id
	@Column(name="sno")
private int studentNo;
@Lob
private Blob image;
public void setStudentNo(int studentNo) {
	this.studentNo = studentNo;
}
public void setImage(Blob image) {
	this.image = image;
}
public int getStudentNo() {
	return studentNo;
}
public Blob getImage() {
	return image;
}

}
