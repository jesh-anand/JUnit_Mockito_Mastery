package com.prajesh.order.bo.exception;

import java.sql.SQLException;

/**
 * Created by Prajesh Ananthan on 19/11/2016.
 */
public class BOException extends Exception {
    public BOException(SQLException e) {
        super(e);
    }
}
