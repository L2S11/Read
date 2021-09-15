package com.lgy.admin.controller.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件上传
 */
@Controller
public class FromTextContorller {

    @GetMapping("/form_layouts.html")
    public String form_layouts(){
        return "from/form_layouts";
    }

    /**
     * MultiparFile自动封装我们上传的文件
     * @param email
     * @param username
     * @param headerImg
     * @param photos
     * @return
     */
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile[] photos) throws IOException {
        if(!headerImg.isEmpty()){
            //保存到文件服务器 oss服务器
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("D:\\phoyo\\"+originalFilename));
        }
        if(photos.length > 0){
            for (MultipartFile photo : photos) {
                if (!photo.isEmpty()){
                    String originalFilename = photo.getOriginalFilename();
                    photo.transferTo(new File("D:\\phoyo\\"+originalFilename));
                }
            }
        }
        return "main";
    }
}
