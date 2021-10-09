package com.draw.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.draw.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
@TableName("User")
public interface UserMapper extends BaseMapper<User> {
    /**
     *随机抽签
     *
     * @return
     */
    int getRandomDrawing();

    /**
     *获取签池的签的最大Id
     *
     * @return
     */
//    int getDrawingMaxId();

}
