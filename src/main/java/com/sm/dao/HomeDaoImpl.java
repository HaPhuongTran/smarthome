package com.sm.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sm.entity.HomeProject;

@Repository
@Transactional
public class HomeDaoImpl implements HomeDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void addHome(HomeProject homeProject) {
		 Session session = sessionFactory.getCurrentSession();
		 session.save(homeProject);
	}
}
