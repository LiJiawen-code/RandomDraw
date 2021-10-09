package com.draw.controller;


import com.draw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getMaxId")
    public int getDrawingMaxId(){
        System.out.println(userService.getDrawingMaxId());
        return userService.getDrawingMaxId();
    }
}
