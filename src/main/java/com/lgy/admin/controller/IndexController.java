package com.lgy.admin.controller;

import com.lgy.admin.pojo.User;
import com.lgy.admin.pojo.xuesheng;
import com.lgy.admin.service.AdminService;
import com.lgy.admin.service.XueshengService;
import com.lgy.admin.service.impl.AdminServiceImpl;
import com.lgy.admin.service.impl.XueshengServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
public class IndexController {
    @Autowired
    XueshengService xueshengService;
    @Autowired
    AdminService adminService;

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
        User user1 = adminService.getuser(user.getUserName());
        if(!StringUtils.isEmpty(user1)) {
            if (Objects.equals(user1.getPassword(), user.getPassword())) {
                System.out.println(user1.toString());
                //把登陆成功的用户保存起来
                session.setAttribute("loginUser", user);
                //登陆成功重定向到main.html 防止重复提交
                return "redirect:/main.html";
            } else {
                //回到登陆页
                model.addAttribute("msg", "账号密码错误");

            }
        }
        return "login";
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
