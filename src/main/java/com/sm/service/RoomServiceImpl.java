package com.sm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.dao.RoomDao;
import com.sm.entity.Rooms;


@Service
@Transactional
public class RoomServiceImpl implements RoomService {
	@Autowired
    RoomDao roomDao;
	
	public void createRoom(Rooms room) {
		roomDao.addRoom(room);	
	}
	
	public void updateRoom(Rooms room) {
		roomDao.updateRoom(room);
	}
}
