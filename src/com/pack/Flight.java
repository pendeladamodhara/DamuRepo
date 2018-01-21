package com.pack;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

@Entity
@Filter(name="filter1",condition="status=:status")
@FilterDef(name="filter1",parameters=@ParamDef(name="status",type="string"))
public class Flight {
	@Id
private int flightno;
private String source;
private String destinatio;
private String status;
public int getFlightno() {
	return flightno;
}
public void setFlightno(int flightno) {
	this.flightno = flightno;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestinatio() {
	return destinatio;
}
public void setDestinatio(String destinatio) {
	this.destinatio = destinatio;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Flight [flightno=" + flightno + ", source=" + source + ", destinatio=" + destinatio + ", status=" + status
			+ "]";
}

}
