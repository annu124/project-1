package com.ProjectBack.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ProjectBack.dao.CartDAO;
import com.ProjectBack.model.Cart;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	@Autowired
	SessionFactory factory;

	public CartDAOImpl(SessionFactory factory) {
		this.factory = factory;
	}

	public List<Cart> getcartitems(String username) {
		Session session = factory.openSession();
		Query<Cart> query = session.createQuery("from cart where user.userName=:username and status=:status");
		query.setParameter("username", username);
		query.setParameter("status", "U");
		List<Cart> list = query.list();
		session.close();
		return list;
	}

	@Transactional
	public boolean insertOrUpdateCart(Cart cart_item) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(cart_item);
		return true;
	}

	public Cart getcartitembyid(int id) {
		Session session = factory.openSession();
		Cart cart_item=session.get(Cart.class,id);
		session.close();
		return cart_item;
	}

	public Cart checkCartItem(String username, int p_id) {
		Session session = factory.openSession();
		Query<Cart> query = session.createQuery("from cart where user.userName=:username and status=:status and pro.p_id=:p_id");
		query.setParameter("username", username);
		query.setParameter("status", "U");
		query.setParameter("p_id", p_id);
		List<Cart> list = query.list();
		for(Cart c:list)
			if(c!=null){
				return c;
			}
		session.close();
		return null;
		}

	@Transactional
	public boolean deleteCartItem(Cart cart_item) {
		Session session = factory.getCurrentSession();
		session.delete(cart_item);	
		return true;
	}

}
