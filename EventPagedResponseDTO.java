package com.app.dto;

import java.util.List;

import lombok.Data;

@Data
public class EventPagedResponseDTO {
	
	
	private List<EventResponseDTO> eventlist;
	
	
	private int current;
	
	
	private long total;
	
	
	private int pagesize;


	public List<EventResponseDTO> getEventlist() {
		return eventlist;
	}


	public void setEventlist(List<EventResponseDTO> eventlist) {
		this.eventlist = eventlist;
	}


	public int getCurrent() {
		return current;
	}


	public void setCurrent(int current) {
		this.current = current;
	}


	public long getTotal() {
		return total;
	}


	public void setTotal(long total) {
		this.total = total;
	}


	public int getPagesize() {
		return pagesize;
	}


	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}


	
	
//	public List<EventResponseDTO> eventlist() {
//		return eventlist;
//	}
//	public void eventlist(List<EventResponseDTO> eventlist) {
//		this.eventlist = eventlist;
//	}
		
	
}
