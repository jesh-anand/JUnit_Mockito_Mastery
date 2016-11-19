package com.prajesh.order.dao.impl;

import com.prajesh.order.dao.OrderDao;
import com.prajesh.order.dao.bean.Order;

import java.sql.SQLException;

/**
 * @author Prajesh Ananthan
 * Created by Prajesh Ananthan on 19/11/2016.
 */
public class OrderDaoImpl implements OrderDao {
    public int create(Order order) throws SQLException {
        return 0;
    }

    public Order read(int id) throws SQLException {
        return null;
    }

    public int update(Order order) throws SQLException {
        return 1;
    }

    public int delete(int id) throws SQLException {
        return 0;
    }
}
