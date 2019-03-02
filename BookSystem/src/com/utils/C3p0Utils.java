package com.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C3p0Utils {
    private C3p0Utils() {
    }

    ;
    private static ComboPooledDataSource ds = null;
    private static ThreadLocal<Connection> tLocal = new ThreadLocal<>();

    static {
        //获取xml内的配置信息
        ds = new ComboPooledDataSource("BarryLee");
    }

    public static DataSource getDataSource() {
        return ds;
    }

    public static Connection getConnection() {
        Connection conn = tLocal.get();
        if (conn == null) {
            //如果没有Connection对象，就获取一个
            try {
                conn = ds.getConnection();
                tLocal.set(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            if (conn.isClosed()) {
                //如果获取Connection对象被关闭了，就重新获取一个
                try {
                    conn = ds.getConnection();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void connectClose(Connection conn, PreparedStatement stmt, ResultSet set) {

        try {
            if (set != null) {
                set.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
