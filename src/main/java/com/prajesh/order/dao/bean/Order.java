package com.prajesh.order.dao.bean;

import com.prajesh.order.dao.OrderDao;

/**
 * Created by Prajesh on 19/11/2016.
 */
public class Order {

    private int id;
    String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
