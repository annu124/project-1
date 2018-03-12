package com.ProjectBack.dao;

import java.util.List;

import com.ProjectBack.model.Cart;

public interface CartDAO {


	public List<Cart> getcartitems(String username);
	public Cart getcartitembyid(int id);
	public boolean insertOrUpdateCart(Cart cart_item);
	public Cart checkCartItem(String username,int p_id);
	public boolean deleteCartItem(Cart cart_item);
}

