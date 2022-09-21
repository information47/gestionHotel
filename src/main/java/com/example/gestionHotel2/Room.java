package com.example.gestionHotel2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Room {
	@Id
	@GeneratedValue
	private int roomId;
	private int number;
	private int size;
	private int places;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPlaces() {
		return places;
	}
	public void setPlaces(int places) {
		this.places = places;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int rommId) {
		this.roomId = roomId;
	}
	
}
