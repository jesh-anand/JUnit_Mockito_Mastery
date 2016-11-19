package com.prajesh.order.dao;

import com.prajesh.order.dao.bean.Order;

import java.sql.SQLException;

/**
 * Created by Prajesh on 19/11/2016.
 */
public interface OrderDao {
    int create( Order order) throws SQLException;

    Order read(int id) throws SQLException;

    int update (Order order) throws SQLException;

    int delete (int id) throws SQLException;
}
