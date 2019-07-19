package com.malei.springboot_mysql.service;

import com.malei.springboot_mysql.entity.RfidAlarm;

import java.util.List;

public interface RfidAlarmService {
    //查询报警信息
    List<RfidAlarm> queryAll();
}
