package com.draw.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.draw.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Lee
 */
@Mapper
@Repository
@TableName("User")
public interface UserMapper extends BaseMapper<User> {
}
