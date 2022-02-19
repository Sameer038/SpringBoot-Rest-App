package com.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.dao.IrctcDao;
import com.sb.request.PassengerRequest;
import com.sb.response.TicketResponse;

@Service
public class IrctcService {
	@Autowired
	private IrctcDao dao;
	
	public String bookTicket(PassengerRequest request) {
		
		TicketResponse response= new TicketResponse();
		response.setTicketId(123);
		response.setName(request.getName());
		response.setStatus("CONFIRMED");
		response.setCost(545.50);
		response.setFrom(request.getFrom());
		response.setTo(request.getTo());
		response.setJdate(request.getJdate());
		response.setPnr("PNR2354545");
		
		dao.saveTicket(response);
		
		return "PNR2354545";
	}
	
	public TicketResponse getTicketByPnr(String pnr) {
		return dao.getTicketByPnr(pnr);
		
		
		
	}
	
	public String updateTicket(TicketResponse ticket) {
		return dao.updateTicket(ticket);
		
	}
	
	public String deleteTicket(String pnr) {
		return dao.deleteTicket(pnr);
		
	}

}
