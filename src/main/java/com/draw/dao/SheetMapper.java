package com.draw.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.draw.domain.Sheet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
@TableName("sheet")
public interface SheetMapper extends BaseMapper<Sheet> {

}
