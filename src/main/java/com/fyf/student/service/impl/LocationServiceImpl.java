package com.fyf.student.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fyf.student.mapper.LocationMapper;
import com.fyf.student.entity.Location;
import com.fyf.student.service.ILocationService;
import org.springframework.stereotype.Service;

/**
 * @author fuyufan
 * @date 2020/11/26 16:37
 */
@Service
public class LocationServiceImpl extends ServiceImpl<LocationMapper, Location> implements ILocationService {
}
