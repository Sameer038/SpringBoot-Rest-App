package com.sb.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerRequest {
	
	private String name;
	private String email;
	private String phno;
	private String from;
	private String to;
	private String jdate;
	private String trainNum;
	
	
	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPhno() {
		return phno;
	}




	public void setPhno(String phno) {
		this.phno = phno;
	}




	public String getFrom() {
		return from;
	}




	public void setFrom(String from) {
		this.from = from;
	}




	public String getTo() {
		return to;
	}




	public void setTo(String to) {
		this.to = to;
	}




	public String getJdate() {
		return jdate;
	}




	public void setJdate(String jdate) {
		this.jdate = jdate;
	}




	public String getTrainNum() {
		return trainNum;
	}




	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}




	@Override
	public String toString() {
		return "PassengerRequest [name=" + name + ", email=" + email + ", phno=" + phno + ", from=" + from + ", to="
				+ to + ", jdate=" + jdate + ", trainNum=" + trainNum + "]";
	}
	
	

}
