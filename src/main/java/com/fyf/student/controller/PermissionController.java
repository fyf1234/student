package com.fyf.student.controller;

import com.fyf.student.model.ResultModel;
import com.fyf.student.service.IPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuyufan
 * @date 2020/11/30 11:03
 */
@Slf4j
@RestController
@RequestMapping("/per")
@Api("权限接口")
public class PermissionController extends BaseController{

    @Autowired
    IPermissionService service;

    @GetMapping("/find")
    @ApiOperation("查找权限")
    public ResultModel findById(@RequestParam("id") Long id) {
        if(service.getById(id) != null){
            System.out.println(service.getById(id).toString());}
        return success(service.getById(id));
    }
}
