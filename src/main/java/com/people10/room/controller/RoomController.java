package com.people10.room.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.people10.room.model.AddRoomCriteria;
import com.people10.room.model.Room;
import com.people10.room.repo.RoomRepository;

@RestController
@RequestMapping("/api")
public class RoomController {

	@Autowired
	private RoomRepository roomRepository;

	@PostMapping("/rooms")
	public Room addRoom(@RequestBody AddRoomCriteria roomBuilderCriteria) {

		Room room = new Room();
		room.setRoomRent(roomBuilderCriteria.getRoomRent());
		room.setRoomType(roomBuilderCriteria.getRoomType());

		return roomRepository.save(room);
	}

	@GetMapping("/rooms")
	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}
}
