package com.dao;

import com.utils.C3p0Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class C3p0Dao {

    public List dql(String sql, Object... x) throws SQLException {
        //获得一个conn,从c3p0池中获取
        Connection conn = C3p0Utils.getConnection();
        PreparedStatement stmt = null;
        ResultSet res = null;
        stmt = conn.prepareStatement(sql);
        for (int i = 0; i < x.length; i++) {
            stmt.setObject(i + 1, x[i]);
        }

        res = stmt.executeQuery();

        List list = resList(res);

        C3p0Utils.connectClose(conn, stmt, res);

        return list;
    }

    public int dml(String sql, Object... x) {
        Connection conn = C3p0Utils.getConnection();
        PreparedStatement stmt = null;
        //定义成功插入的条数
        int num = 0;
        try {
            stmt = conn.prepareStatement(sql);
            for (int i = 0; i < x.length; i++) {
                stmt.setObject(i + 1, x[i]);
            }
            num = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        C3p0Utils.connectClose(conn, stmt, null);
        return num;
    }

    public abstract List resList(ResultSet res);

}
