package com.fyf.student.controller;

import com.fyf.student.entity.User;
import com.fyf.student.model.ResultModel;
import com.fyf.student.service.ILocationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fuyufan
 * @date 2020/11/26 10:21
 */
@Slf4j
@RestController
@RequestMapping("/test")
@Api("接口")
public class LocationController extends BaseController{

    @Autowired
    private ILocationService service;

    @PostMapping("/add")
    @ApiOperation("新增用户")
    public String addUser(@RequestBody User user) {
        return "新增成功";
    }

    @GetMapping("/find")
    @ApiOperation("查找用户")
    public ResultModel findById(@RequestParam("id") Long id) {
        if(service.getById(id) != null){
        System.out.println(service.getById(id).toString());}
        return success(service.getById(id));
    }

    @PutMapping("/update")
    @ApiOperation("更新用户")
    public boolean update(@RequestBody User user) {
        return true;
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("删除用户")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }


}
