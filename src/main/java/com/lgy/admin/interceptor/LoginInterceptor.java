package com.lgy.admin.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆检查
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登陆逻辑检查
        HttpSession session = request.getSession();
       Object loginUser = session.getAttribute("loginUser");
       if(loginUser != null){
           return true;
       }
       session.setAttribute("msg","请先登陆");
       response.sendRedirect("/");
        return false;
    }
}
