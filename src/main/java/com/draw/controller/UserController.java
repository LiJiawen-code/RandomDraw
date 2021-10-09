package com.draw.controller;


import com.draw.domain.FebsResponse;
import com.draw.domain.Sheet;
import com.draw.domain.User;
import com.draw.service.SheetService;
import com.draw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    SheetService sheetService;


    /**
     *
     * @param user
     * @return
     */
    @GetMapping("/getRandomDrawingId")
    public FebsResponse getRandomDrawingIdAndSave(User user){
        int SheetNum = sheetService.selectSheetMaxId();
        int getNum = userService.getRandomDrawingId(SheetNum);
        user.setDrawingId(getNum);

        //查询显示
        try {
            Sheet sheet = sheetService.selectSheet(getNum);
            return new FebsResponse().code("200").message("查询成功").data(sheet);
        } catch (Exception e) {
            return new FebsResponse().code("500").message("查询失败");
        }
        //将User保存入数据库
    }




}
