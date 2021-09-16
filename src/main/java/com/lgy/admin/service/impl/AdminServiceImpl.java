package com.lgy.admin.service.impl;

import com.lgy.admin.mapper.adminMapper;
import com.lgy.admin.pojo.User;
import com.lgy.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    adminMapper adminMapper;
    public User getuser(String userName){
        return adminMapper.getuser(userName);
    }
}
