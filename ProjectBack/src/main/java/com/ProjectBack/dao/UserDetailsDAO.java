package com.ProjectBack.dao;



import javax.transaction.Transactional;

import org.hibernate.Session;

import com.ProjectBack.model.UserDetails;

public interface UserDetailsDAO {
	public boolean addUserDetailsDAO(UserDetails userDetails);
	
}
