package com.people10.room.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.people10.room.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
	
}
