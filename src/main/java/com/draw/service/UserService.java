package com.draw.service;

import com.draw.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    int getRandomDrawingId(Integer MaxNum);
    User saveUser(User user);
    List<User> selectByIp(String Ip);
}
