package com.sm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.entity.HomeProject;
import com.sm.entity.Rooms;
import com.sm.service.HomeService;
import com.sm.service.RoomService;

@RestController
@RequestMapping(value={"/smarthome"})
public class RoomController {
	
	@Autowired
	HomeService homeService;
	
	@Autowired
	RoomService roomService;
	
	@RequestMapping(value = "/createhome/{number_room}", headers="Accept=application/json")
	public boolean createHome(HomeProject homeProject, Rooms room, @PathVariable("number_room") int number ){
		homeService.createHome(homeProject);
		for(int i = 0; i<number; i++) {
		room.setHomeId(homeProject);
		roomService.createRoom(room);
		}
		return true;
	}

}
