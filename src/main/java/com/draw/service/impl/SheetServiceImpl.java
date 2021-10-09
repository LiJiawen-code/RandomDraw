package com.draw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.draw.dao.SheetMapper;
import com.draw.domain.Sheet;
import com.draw.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SheetServiceImpl implements SheetService {
    @Autowired
    SheetMapper sheetMapper;

    /**
     * 插入数据
     *
     * @param sheet
     * @return
     */
    @Override
    public int insertSheet(Sheet sheet) {
        return sheetMapper.insert(sheet);
    }

    /**
     * 根据id删除数据
     *
     * @param id
     * @return
     */
    @Override
    public int deleteSheet(Integer id) {
        if (id == 0) {
            System.out.println("id不能为空");
            return 0;
        } else {
            return sheetMapper.deleteById(id);
        }
    }

    /**
     * 修改数据
     *
     * @param sheet
     * @return
     */
    @Override
    public int updateSheet(Sheet sheet) {
        if (sheet.getId() == 0) {
            System.out.println("id不能为空");
            return 0;
        } else {
            return sheetMapper.updateById(sheet);
        }
    }

    /**
     * 根据id查找数据
     *
     * @param id
     * @return
     */
    @Override
    public Sheet selectSheet(Integer id) {
        if (id == 0) {
            System.out.println("id不能为空");
            return null;
        } else {
            return sheetMapper.selectById(id);
        }
    }

    /**
     * 查找签池中最大的id值
     *
     * @return
     */
    @Override
    public int selectSheetMaxId() {
        QueryWrapper<Sheet> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .orderByDesc(Sheet::getId).last("limit 1");
        int DrawingMaxId = sheetMapper.selectOne(queryWrapper).getId();
        return DrawingMaxId;
    }
}
