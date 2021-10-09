package com.draw.service.impl;

import com.draw.dao.SheetMapper;
import com.draw.domain.Sheet;
import com.draw.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SheetServiceImpl implements SheetService {
    @Autowired
    SheetMapper sheetMapper;

    @Override
    public int insertSheet(Sheet sheet) {
        return sheetMapper.insert(sheet);
    }

    @Override
    public int deleteSheet(Integer id) {
        if (id == 0) {
            System.out.println("id不能为空");
            return 0;
        } else {
            return sheetMapper.deleteById(id);
        }
    }

    @Override
    public int updateSheet(Sheet sheet) {
        if (sheet.getId() == 0) {
            System.out.println("id不能为空");
            return 0;
        } else {
            return sheetMapper.updateById(sheet);
        }
    }

    @Override
    public Sheet selectSheet(Integer id) {
        if (id == 0) {
            System.out.println("id不能为空");
            return null;
        } else {
            return sheetMapper.selectById(id);
        }
    }
}
