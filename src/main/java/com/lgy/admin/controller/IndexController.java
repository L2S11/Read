package com.lgy.admin.controller;

import com.lgy.admin.pojo.User;
import com.lgy.admin.pojo.xuesheng;
import com.lgy.admin.service.xueshengService;
import com.sun.net.httpserver.HttpsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    xueshengService xueshengService;

    @ResponseBody
    @GetMapping("/xuesheng")
    public xuesheng getById(@RequestParam("id") Long id){
        return xueshengService.getxueshengid(id);
    }
    /**
     * 登陆页
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){

        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){

        if(!StringUtils.isEmpty(user.getUserName()) && "123".equals(user.getPassword())){
            //把登陆成功的用户保存起来
            session.setAttribute("loginUser",user);
            //登陆成功重定向到main.html 防止重复提交
            return "redirect:/main.html";
        }else {
            //回到登陆页
            model.addAttribute("msg","账号密码错误");
            return "login";
        }

    }

    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){

            return "main";
    }
}
