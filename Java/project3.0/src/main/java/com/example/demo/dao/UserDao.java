package com.example.demo.dao;

import com.example.demo.entiry.contorller;
import com.example.demo.entiry.user;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository

public class UserDao implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public user Find(String id, String password) {
        //sql语言
        String sql = "SELECT * FROM user  WHERE id = ? AND password = ?";
        user s = new user();
        //执行查找命令
        jdbcTemplate.query(sql, new Object[]{id, password}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                s.setId(resultSet.getString(1));
                s.setPassword(resultSet.getString(2));
                s.setName(resultSet.getString(3));
            }
        });
        return s;
    }

    @Override
    public boolean Add(user user) {
        return false;
    }

    @Override
    public boolean Del(String id) {
        return false;
    }

    @Override
    public boolean Update(String id, String password, String name) {
        return false;
    }
}
