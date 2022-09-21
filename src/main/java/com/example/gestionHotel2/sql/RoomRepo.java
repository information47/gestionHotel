package com.example.gestionHotel2.sql;

import org.springframework.data.repository.CrudRepository;

import com.example.gestionHotel2.Room;

public interface RoomRepo extends CrudRepository<Room, Integer> {

}