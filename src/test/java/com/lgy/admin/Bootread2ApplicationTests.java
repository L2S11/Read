package com.lgy.admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class Bootread2ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    void contextLoads() {
//        jdbcTemplate.queryForObject("select * from xuesheng")
        Long aLong = jdbcTemplate.queryForObject("select count(*) from compare_data", Long.class);
        System.out.println();
    }

}
