package com.sb.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketResponse {
	
	private Integer ticketId;
	private String status;
	private Double cost;
	private String from;
	private String to;
	private String pnr;
	private String jdate;
	private String name;
	
	
	
	
	
	public Integer getTicketId() {
		return ticketId;
	}





	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}





	public Double getCost() {
		return cost;
	}





	public void setCost(Double cost) {
		this.cost = cost;
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





	public String getPnr() {
		return pnr;
	}





	public void setPnr(String pnr) {
		this.pnr = pnr;
	}





	public String getJdate() {
		return jdate;
	}





	public void setJdate(String jdate) {
		this.jdate = jdate;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	@Override
	public String toString() {
		return "TicketResponse [ticketId=" + ticketId + ", status=" + status + ", cost=" + cost + ", from=" + from
				+ ", to=" + to + ", pnr=" + pnr + ", jdate=" + jdate + ", name=" + name + "]";
	}
	
	

}
