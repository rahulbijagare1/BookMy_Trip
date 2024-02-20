package com.app.dto;

import java.sql.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.web.multipart.MultipartFile;

import com.app.pojos.Event;

import lombok.Data;


@Data
public class EventDTO {
	
	private int eventid;
	
	
	private String eventname;
	
	
	private String eventcat;
	
	
	private int price;
	
	
	private String description;
	
	
	private String noofdays;
	
	
	private String dailywiseschedule;
	
	
	private String thingstocarry;
	
	
	private String pickupanddroplocation;
	
	
	private int guideId;
	
	
	private String location;
	
	
	private MultipartFile pic1;
	
	
	private MultipartFile pic2;
	
	
	private MultipartFile pic3;
	
	 private Date date;
	
	
	public static Event toEntity(EventDTO dto) {
		Event entity=new Event();
		BeanUtils.copyProperties(dto, entity, "pic1", "pic2", "pic3");		
		return entity;
	}


	public int getEventid() {
		return eventid;
	}


	public void setEventid(int eventid) {
		this.eventid = eventid;
	}


	public String getEventname() {
		return eventname;
	}


	public void setEventname(String eventname) {
		this.eventname = eventname;
	}


	public String getEventcat() {
		return eventcat;
	}


	public void setEventcat(String eventcat) {
		this.eventcat = eventcat;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getNoofdays() {
		return noofdays;
	}


	public void setNoofdays(String noofdays) {
		this.noofdays = noofdays;
	}


	public String getDailywiseschedule() {
		return dailywiseschedule;
	}


	public void setDailywiseschedule(String dailywiseschedule) {
		this.dailywiseschedule = dailywiseschedule;
	}


	public String getThingstocarry() {
		return thingstocarry;
	}


	public void setThingstocarry(String thingstocarry) {
		this.thingstocarry = thingstocarry;
	}


	public String getPickupanddroplocation() {
		return pickupanddroplocation;
	}


	public void setPickupanddroplocation(String pickupanddroplocation) {
		this.pickupanddroplocation = pickupanddroplocation;
	}


	public int getGuideId() {
		return guideId;
	}


	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public MultipartFile getPic1() {
		return pic1;
	}


	public void setPic1(MultipartFile pic1) {
		this.pic1 = pic1;
	}


	public MultipartFile getPic2() {
		return pic2;
	}


	public void setPic2(MultipartFile pic2) {
		this.pic2 = pic2;
	}


	public MultipartFile getPic3() {
		return pic3;
	}


	public void setPic3(MultipartFile pic3) {
		this.pic3 = pic3;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	




	


	
	
}
