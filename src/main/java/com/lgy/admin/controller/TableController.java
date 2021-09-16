package com.lgy.admin.controller;

import com.lgy.admin.pojo.Teacher;
import com.lgy.admin.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TableController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/basic_table.html")
    public  String basic_table(){

        return "table/basic_table";
    }
    @GetMapping("/dynamic_table.html")
    public String  dynamic_table(Model model){
        List<Teacher> list = teacherService.list();
        model.addAttribute("teachers",list);
        return "table/dynamic_table";
    }
    @GetMapping("responsive_table.html")
    public  String responsive_table(){

        return "table/responsive_table";
    }
    @GetMapping("editable_table.html")
    public  String editable_table(){
        int i=10/0;
        return "table/editable_table";
    }
}
