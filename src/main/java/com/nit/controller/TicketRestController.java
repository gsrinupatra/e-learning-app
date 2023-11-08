package com.nit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.bindings.PassengerInfo;
import com.nit.bindings.TicketInfo;

@RestController
public class TicketRestController {
	@PostMapping(
			value="/ticket",
			produces= {"application/json"},
			consumes= {"application/json"}
			
	)
	public ResponseEntity<PassengerInfo> bookTicket(@RequestBody PassengerInfo request){
		System.out.println(request);
		
		TicketInfo tinfo=new TicketInfo();
		tinfo.setTicketId(12345);
		tinfo.setPnr("JLJL0868");
		tinfo.setTicketStatus("CONFIRMED");
		
		
		return new ResponseEntity (tinfo,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo request ){
		
		String msg="ticket updated";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<TicketInfo> deleteTicket( @PathVariable("ticketId") Integer ticketId){
		
		String msg="ticket deleted";
		return new ResponseEntity (msg, HttpStatus.OK);
		
	}




}
