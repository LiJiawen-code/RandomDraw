package com.draw.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    int getRandomDrawingId(Integer MaxNum);
}
