package com.draw.controller;


import com.draw.domain.Sheet;
import com.draw.service.SheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.draw.domain.FebsResponse;

/**
 * @author Lee
 */
@RestController
@RequestMapping("/sheet")
public class SheetController {
    @Autowired
    SheetService sheetService;

    @PostMapping("/insert")
    public FebsResponse insertBySheet(Sheet sheet) {
        try {
            sheetService.insertSheet(sheet);
            return new FebsResponse().code("200").message("查询成功").data(sheet);
        } catch (Exception e) {
            return new FebsResponse().code("500").message("查询失败");
        }
    }

    @GetMapping("/deleteById")
    public FebsResponse deleteSheetInfo(Integer id) {
        try {
            sheetService.deleteSheet(id);
            return new FebsResponse().code("200").message("删除成功");
        } catch (Exception e) {
            return new FebsResponse().code("500").message("删除失败");
        }
    }

    @GetMapping("/update")
    public FebsResponse updateSheetInfo(Sheet sheet) {
        try {
            sheetService.updateSheet(sheet);
            return new FebsResponse().code("200").message("更新成功");
        } catch (Exception e) {
            return new FebsResponse().code("500").message("更新失败");
        }
    }

    @GetMapping("/findById/{id}")
    public FebsResponse findBySheetId(@PathVariable("id") Integer id) {
        try {
            Sheet sheet = sheetService.selectSheet(id);
            return new FebsResponse().code("200").message("查询成功").data(sheet);
        } catch (Exception e) {
            return new FebsResponse().code("500").message("查询失败");
        }
    }

//    @GetMapping("/findMaxId")
//    public FebsResponse findBySheetId() throws Exception {
//        try {
//            int MaxId = sheetService.selectSheetMaxId();
//            return new FebsResponse().code("200").message("查询成功").data(MaxId);
//        } catch (Exception e) {
//            return new FebsResponse().code("500").message("查询失败");
//        }
//    }


}
