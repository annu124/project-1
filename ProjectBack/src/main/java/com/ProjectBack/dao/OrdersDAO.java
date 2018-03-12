package com.ProjectBack.dao;

import java.util.List;

import com.ProjectBack.model.Orders;
import com.ProjectBack.model.ShippingAddress;

public interface OrdersDAO {
		boolean insertAddress(ShippingAddress shippingAddress);

		boolean insertOrders(Orders orders);

		List<Orders> getOrdersByUser(String username);

}
