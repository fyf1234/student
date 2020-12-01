package com.fyf.student.controller;

import com.fyf.student.model.ResultModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * @author fuyufan
 * @date 2020/12/1 16:53
 */
@Slf4j
@RestController
@RequestMapping("/redis")
@Api("Redis测试")
public class RedisController extends BaseController{

    @Autowired
    RedisTemplate redisTemplate;

    @GetMapping("/find")
    @ApiOperation("查找用户")
    public ResultModel findById(@RequestParam("string") String string) {
        Set<String> keys = redisTemplate.keys(string.concat("*"));
        List<String> values = redisTemplate.opsForValue().multiGet(keys);
        return success("键:"+keys.toString()+" "+"值"+values.toString());
    }
}
