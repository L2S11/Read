package com.lgy.admin.service.impl;

import com.lgy.admin.mapper.xueshengMapper;
import com.lgy.admin.pojo.xuesheng;
import com.lgy.admin.service.XueshengService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XueshengServiceImpl implements XueshengService {

    @Autowired
    xueshengMapper xueshengMapper;
    public xuesheng getxueshengid(Long id){
        return xueshengMapper.getxuesheng(id);
    }
}
