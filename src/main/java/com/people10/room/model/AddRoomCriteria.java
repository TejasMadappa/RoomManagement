package com.people10.room.model;

public class AddRoomCriteria {
	private String roomType;
	private Double roomRent;

	// instead of getter setters we can use builder pattern. For time being I have
	// used getters and setters.
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
}
