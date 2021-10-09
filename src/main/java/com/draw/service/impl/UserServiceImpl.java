package com.draw.service.impl;

import com.draw.dao.UserMapper;
import com.draw.domain.User;
import com.draw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int getRandomDrawingId(Integer MaxNum){
        Random r = new Random();
        int RandomDrawingId = r.nextInt(MaxNum-1)+1;
        return RandomDrawingId;
    }

}
