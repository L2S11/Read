package com.lgy.admin.mapper;

import com.lgy.admin.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface adminMapper {
    public User getuser(String userName);
}
