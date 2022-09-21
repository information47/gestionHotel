package com.example.gestionHotel2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestionHotel2.sql.RoomRepo;

@RestController
public class GestionController {
	
	@Autowired
	private RoomRepo roomRepo;
	
	@GetMapping("/rooms")
	public Iterable<Room> getRooms() {
		return roomRepo.findAll();
	}
	@GetMapping("/addRoom")
		public void addRandomRoom() {
			Room room = new Room();
			room.setNumber(10);
			
			roomRepo.save(room);			
		}
}
