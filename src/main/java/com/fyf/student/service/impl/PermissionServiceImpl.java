package com.fyf.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fyf.student.entity.Permission;
import com.fyf.student.mapper.PermissionMapper;
import com.fyf.student.service.IPermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fuyufan
 * @date 2020/11/30 10:13
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {
    @Override
    public List<String> getPermissionByUserId(Long userId) {
        return null;
    }
}
