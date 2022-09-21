package com.example.gestionHotel2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionController {
	@GetMapping("/room")
	public Room returnRoom() {
		Room room = new Room();
		room.setNumber(1);
		room.setSize(32);
		room.setSize(2);
		
		return room;
	}
}
