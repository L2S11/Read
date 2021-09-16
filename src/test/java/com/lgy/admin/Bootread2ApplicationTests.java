package com.lgy.admin;

import com.lgy.admin.mapper.adminMapper;
import com.lgy.admin.mapper.teacherMapper;
import com.lgy.admin.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class Bootread2ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    adminMapper adminMapper;
    @Autowired
    teacherMapper teacherMapper;
    @Test
    void contextLoads() {
//        jdbcTemplate.queryForObject("select * from xuesheng")
        Object o = teacherMapper.selectById(1);
        System.out.println(o);

    }

}
