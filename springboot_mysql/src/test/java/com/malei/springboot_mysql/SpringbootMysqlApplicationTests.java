package com.malei.springboot_mysql;

import com.malei.springboot_mysql.entity.RfidAlarm;
import com.malei.springboot_mysql.service.RfidAlarmService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMysqlApplicationTests {
    @Resource
    private RfidAlarmService rfidAlarmService;
    @Test
    public void contextLoads() {
        List<RfidAlarm> rfidAlarms = rfidAlarmService.queryAll();
        for (RfidAlarm rfidAlarm:rfidAlarms) {
            System.out.println(rfidAlarm);
        }
    }

}
