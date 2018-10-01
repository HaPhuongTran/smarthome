package com.sm.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sm.entity.AC;

@Resposity
public class ACServiceImpl implements ACService{
	
	@Autowired
	private ACDao acDao;
	public void createAC(AC ac) {
		acDao.createAC(ac);
	}
}
