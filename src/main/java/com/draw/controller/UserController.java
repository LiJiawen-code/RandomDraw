package com.draw.controller;

import com.draw.domain.FebsResponse;
import com.draw.domain.User;
import com.draw.service.SheetService;
import com.draw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Lee
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    SheetService sheetService;


    /**
     *
     * @param user User
     * @return FebsResponse
     */
    @GetMapping("/getRandomDrawingIdAndSave")
    public FebsResponse getRandomDrawingIdAndSave(User user) {
        //查询显示
        try {
            User user1 = userService.saveUser(user);
            return new FebsResponse().code("200").message("抽签成功,已保存至用户！").data(user1.getDrawingId()).data(user1);
        } catch (Exception e) {
            return new FebsResponse().code("500").message("抽签失败！每位用户每天只能进行一次抽签，请勿重复抽签！");
        }
    }
}
