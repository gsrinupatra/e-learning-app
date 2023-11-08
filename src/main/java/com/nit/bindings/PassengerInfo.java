package com.nit.bindings;

import lombok.Data;

@Data
public class PassengerInfo {
	private String name;
	private String phno;
	private String jdate;
	private String from;
	private String to;
	private Integer trainNum;
	
	@Override
	public String toString() {
		return "PassengerInfo [name=" + name + ", phno=" + phno + ", jdate=" + jdate + ", from=" + from + ", to=" + to
				+ ", trainNum=" + trainNum + "]";
	}

	
}
