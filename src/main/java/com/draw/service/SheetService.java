package com.draw.service;

import com.draw.domain.Sheet;

public interface SheetService {
    /**
     * 增
     */
    void insertSheet(Sheet sheet);
    /**
     * 删
     */
    void deleteSheet(Integer id);
    /**
     * 改
     */
    void updateSheet(Sheet sheet);
    /**
     * 查
     */
    Sheet selectSheet(Integer id);
    /**
     * 查询id最大值
     */
    int selectSheetMaxId();
}
