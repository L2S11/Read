package com.lgy.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.lgy.admin")
@MapperScan("com.lgy.admin.mapper")
@SpringBootApplication
public class Bootread2Application {

    public static void main(String[] args) {
        SpringApplication.run(Bootread2Application.class, args);
    }

}
