package com.draw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.draw.dao.UserMapper;
import com.draw.domain.User;
import com.draw.service.SheetService;
import com.draw.service.UserService;
import com.draw.utils.GetIp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.Date;
import java.util.List;
import java.util.Random;

/**
 * @author Lee
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    SheetService sheetService;

    @Override
    public int getRandomDrawingId(Integer maxNum){
        Random r = new Random();
        return r.nextInt(maxNum-1)+1;
    }

    @Override
    public User saveUser(User user){
        //总签数
        int sheetNum = sheetService.selectSheetMaxId();
        //随机抽签
        int getNum = getRandomDrawingId(sheetNum);
        user.setDrawingId(getNum);
        //将User保存入数据库
        String userIp = GetIp.getIpAddr();
        user.setIp(userIp);
        Date date = new Date(System.currentTimeMillis());
        user.setDate(date);
        //根据ip和date验证，每天只可以抽签一次
        List<User> listUser = selectByIp(userIp);
        for (User value : listUser) {
            if (value.getDate().toString().equals(date.toString())) {
                return null;
            }
        }
        userMapper.insert(user);
        return user;
    }

    @Override
    public List<User> selectByIp(String ip) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //查询Ip相同的用户

            queryWrapper.eq("ip",ip);

        return userMapper.selectList(queryWrapper);
    }
}
