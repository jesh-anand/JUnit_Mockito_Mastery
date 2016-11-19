package com.prajesh.order.dao.impl;

import com.prajesh.order.bo.exception.BOException;
import com.prajesh.order.bo.impl.OrderBoImpl;
import com.prajesh.order.dao.OrderDao;
import com.prajesh.order.dao.bean.Order;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.sql.SQLException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Prajesh Ananthan
 * Created by Prajesh Ananthan on 19/11/2016.
 */
public class OrderDaoImplTest {

    @Mock
    OrderDao dao;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void place_order_should_create_an_order() throws SQLException, BOException {
        OrderBoImpl orderBo = new OrderBoImpl();
        orderBo.setDao(dao);

        Order order = new Order();

        // Mock object
        when(dao.create(order)).thenReturn(1);

        boolean result = orderBo.placeOrder(order);

        assertThat(result, is(true));

        // Verify that placeOrder method is called once
        verify(dao, times(1)).create(order);

    }
}