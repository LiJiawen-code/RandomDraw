package com.draw.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheet {
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String code;
    private String bacode;
    private String jie1;
    private String jie2;
    private String guacode;
}
