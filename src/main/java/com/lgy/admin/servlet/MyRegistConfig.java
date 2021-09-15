package com.lgy.admin.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//(proxyBeanMethods = true)保证依赖的组件始终是单实例的
@Configuration(proxyBeanMethods = true)
public class MyRegistConfig {

    @Bean
    public ServletRegistrationBean myServlet(){
        myservlet myservlet = new myservlet();

        return new ServletRegistrationBean(myservlet,"/my");
    }
}
