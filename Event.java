package com.app.pojos;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
@Table(name="event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eventid;
	
	
	private String eventname;
	
	
	private String location;
	
	
	private String eventcat;
	
	
	private String noofdays;
	
	@Column(length = 4000)
	private String dailywiseschedule;
	
	@Column(length = 4000)
	private String thingstocarry;
	
	
	private String pickupanddroplocation;
	
	
	private int price;
	
	@Column(length = 4000)
	private String description;
	
	
	private String photo1;
	
	
	private String photo2;
	
	
	private String photo3;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_timestamp", insertable = false, updatable = false)
	private Date createdTimestamp;
	
	@Basic
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="guided")
	private Guide guide;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEventcat() {
		return eventcat;
	}

	public void setEventcat(String eventcat) {
		this.eventcat = eventcat;
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

	public String getPhoto1() {
		return photo1;
	}

	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}

	public String getPhoto2() {
		return photo2;
	}

	public void setPhoto2(String photo2) {
		this.photo2 = photo2;
	}

	public String getPhoto3() {
		return photo3;
	}

	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Guide getGuide() {
		return guide;
	}

	public void setGuide(Guide guide) {
		this.guide = guide;
	}

	

	

	
	
	
	
	
}