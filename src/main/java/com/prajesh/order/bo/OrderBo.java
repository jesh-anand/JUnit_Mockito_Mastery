package com.prajesh.order.bo;

import com.prajesh.order.bo.exception.BOException;
import com.prajesh.order.dao.bean.Order;

/**
 * Created by Prajesh Ananthan on 19/11/2016.
 */
public interface OrderBo {

    boolean placeOrder(Order order) throws BOException;

    boolean cancelOrder(int id) throws BOException;

    boolean deleteOrder(int id) throws BOException;

}
