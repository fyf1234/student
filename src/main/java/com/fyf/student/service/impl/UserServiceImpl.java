package com.fyf.student.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fyf.student.entity.User;
import com.fyf.student.mapper.UserMapper;
import com.fyf.student.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author fuyufan
 * @date 2020/11/30 10:10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public User findUserByUserName(String userName) {
        QueryWrapper<User> userQueryWrapper;
        return null;
    }
}
