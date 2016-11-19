package com.prajesh.order.bo.impl;

import com.prajesh.order.bo.OrderBo;
import com.prajesh.order.bo.exception.BOException;
import com.prajesh.order.dao.OrderDao;
import com.prajesh.order.dao.bean.Order;

import java.sql.SQLException;

/**
 * Created by Prajesh Ananthan on 19/11/2016.
 */
public class OrderBoImpl implements OrderBo {

    private OrderDao orderDao;
    private static final String CANCELED = "canceled";

    public boolean placeOrder(Order order) throws BOException {
        try {
            int result = orderDao.create(order);

            if (result == 0)
                return false;

        } catch (SQLException e) {
            throw new BOException(e);
        }

        return true;
    }


    public boolean cancelOrder(int id) throws BOException {

        try {
            Order order = orderDao.read(id);
            order.setStatus(CANCELED);
            int result = orderDao.update(order);

            if (result == 0)
                return false;


        } catch (SQLException e) {
            throw new BOException(e);
        }
        return false;
    }

    public boolean deleteOrder(int id) throws BOException {
        try {
            int result = orderDao.delete(id);

            if (result == 0)
                return false;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

}
