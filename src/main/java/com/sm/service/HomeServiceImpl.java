package com.sm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.dao.HomeDao;
import com.sm.entity.HomeProject;

@Service
@Transactional
public class HomeServiceImpl implements HomeService {
	
	@Autowired
    HomeDao homeDao;
	
	public void createHome(HomeProject homeProject) {
		homeDao.addHome(homeProject);	
	}
}
