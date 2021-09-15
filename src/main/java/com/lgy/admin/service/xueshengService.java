package com.lgy.admin.service;

import com.lgy.admin.mapper.xueshengMapper;
import com.lgy.admin.pojo.xuesheng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class xueshengService {

    @Autowired
    xueshengMapper xueshengMapper;
    public xuesheng getxueshengid(Long id){
        return xueshengMapper.getxuesheng(id);
    }
}
