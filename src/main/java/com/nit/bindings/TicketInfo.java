package com.nit.bindings;

import lombok.Data;

@Data
public class TicketInfo {
	private Integer ticketId;
	private String  pnr;
	private String ticketStatus;
	
	@Override
	public String toString() {
		return "TicketInfo [ticketId=" + ticketId + ", pnr=" + pnr + ", ticketStatus=" + ticketStatus + "]";
	}
	
	

}
