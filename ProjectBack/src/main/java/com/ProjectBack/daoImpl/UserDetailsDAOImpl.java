package com.ProjectBack.daoImpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ProjectBack.dao.UserDetailsDAO;
import com.ProjectBack.model.UserDetails;

@Repository("userDetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO{

	@Autowired
	SessionFactory sessionFactory; 
	
	public UserDetailsDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory =sessionFactory;
	}
	@Transactional
	public boolean addUserDetailsDAO(UserDetails userDetails) {
		Session session=sessionFactory.getCurrentSession();
		session.save(userDetails);
		return true;
	}

}
