package com.fyf.student.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fyf.student.entity.Permission;

import java.util.List;

/**
 * @author fuyufan
 * @date 2020/11/30 10:09
 */
public interface IPermissionService extends IService<Permission> {
    List<String> getPermissionByUserId(Long userId);
}
