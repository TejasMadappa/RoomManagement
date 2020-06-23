package com.people10.room.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "roomtype")
	private String roomType;

	@Column(name = "rent")
	private Double roomRent;

	public Long getId() {
		return id;
	}

	public String getRoomType() {
		return roomType;
	}

	public Double getRoomRent() {
		return roomRent;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setRoomRent(Double roomRent) {
		this.roomRent = roomRent;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", roomType=" + roomType + ", roomRent=" + roomRent + "]";
	}

}
