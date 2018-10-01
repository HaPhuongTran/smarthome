package com.sm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ac")
public class AC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ip", nullable = false, unique = true)
	private String ip;
	
	@Column(name = "name", unique = true)
	private String name_ac;
	
	@OneToOne
	@JoinColumn(name = "id_room", nullable = false)
	private Rooms idRoom;

	public int getIdRoom() {
		return idRoom.getId();
	}

	public void setIdRoom(Rooms idRoom) {
		this.idRoom = idRoom;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getName_ac() {
		return name_ac;
	}

	public void setName_ac(String name_ac) {
		this.name_ac = name_ac;
	}
}
