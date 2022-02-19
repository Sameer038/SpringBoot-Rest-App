package com.sb.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.sb.response.TicketResponse;

@Repository
public class IrctcDao {
	
	private Map<String, TicketResponse> ticketMap= new HashMap<>();
	
	
	public String saveTicket(TicketResponse response) {
		//logic will be there to store ticket into db table
		
		ticketMap.put(response.getPnr(), response);
		
		return response.getPnr();
	}
	
	public String updateTicket(TicketResponse response) {
		String pnr= response.getPnr();
		ticketMap.put(pnr, response);
		return "Ticket Updated";
		
	}
	
	public String deleteTicket(String pnr) {
		ticketMap.remove(pnr);
		return "Ticket Deleted";
	}
	
	public TicketResponse getTicketByPnr(String pnr) {
		//logic will be there to get ticket from db table
		if(ticketMap.containsKey(pnr)) {
			return ticketMap.get(pnr);
		}
		
		return null;
	}

}
