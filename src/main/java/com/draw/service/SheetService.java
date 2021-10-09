package com.draw.service;

import com.draw.domain.Sheet;

public interface SheetService {
    /**
     * 增
     */
    int insertSheet(Sheet sheet);
    /**
     * 删
     */
    int deleteSheet(Integer id);
    /**
     * 改
     */
    int updateSheet(Sheet sheet);
    /**
     * 查
     */
    Sheet selectSheet(Integer id);
}
