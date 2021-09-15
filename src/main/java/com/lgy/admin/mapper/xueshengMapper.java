package com.lgy.admin.mapper;

import com.lgy.admin.pojo.xuesheng;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface xueshengMapper {
    public xuesheng getxuesheng(long id);
}
