package com.yuandu.user.dao.mapper;

import com.yuandu.mybatis.mapper.BaseMapper;
import com.yuandu.user.dao.model.UserEntity;
import org.apache.ibatis.annotations.Param;

public interface UserEntityMapper extends BaseMapper<UserEntity> {

    public void remove(@Param("id")Long id);
}