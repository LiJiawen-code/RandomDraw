package com.draw.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(value = "user_id", type = IdType.AUTO)
    private int UserId;
    private String ip;
    private Date date;
    private int DrawingId;
}
