package com.malei.springboot_mysql.service.impl;

import com.malei.springboot_mysql.entity.RfidAlarm;
import com.malei.springboot_mysql.service.RfidAlarmService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springboot
 * @description:
 * @author: Marcos-Lay
 * @create: 2019-07-18 19:26
 **/
@Service
public class RfidAlarmServiceImpl implements RfidAlarmService {
    @Resource
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    public List<RfidAlarm> queryAll() {
        List<RfidAlarm> selectList = sqlSessionTemplate.selectList("RfidAlarm.selectRfidAlarmList");
        return selectList;
    }
}
