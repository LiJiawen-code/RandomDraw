package com.draw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.draw.dao.SheetMapper;
import com.draw.dao.UserMapper;
import com.draw.domain.Sheet;
import com.draw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    SheetMapper sheetMapper;

    @Override
    public int getDrawingMaxId() {
        QueryWrapper<Sheet> queryWrapper = new QueryWrapper();
        queryWrapper.lambda()
                .orderByDesc().first("limit 1");

        int DrawingMaxId = sheetMapper.selectOne(queryWrapper).getId();
        return DrawingMaxId;
    }
}
