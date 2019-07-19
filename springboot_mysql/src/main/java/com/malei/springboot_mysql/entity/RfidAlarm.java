package com.malei.springboot_mysql.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

@Repository
public class RfidAlarm implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 6836551260292908964L;

    private int id;

    //标签Mongo库中所属项目唯一标识
    private String projectId;

    //标签序列号，离线报警时为空
    private String tagSno;

    //标签名称，离线报警时为空
    private String tagName;

    //标签记录关联的读卡器序列号
    private String tagReaderSno;

    //标签记录关联的读卡器名称
    private String tagReaderName;

    //1 - 读卡器离线报警
    //2 - 标签低压报警
    private int alarmType;

    //读卡器记录时间
    private Date recordTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTagSno() {
        return tagSno;
    }

    public void setTagSno(String tagSno) {
        this.tagSno = tagSno;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagReaderSno() {
        return tagReaderSno;
    }

    public void setTagReaderSno(String tagReaderSno) {
        this.tagReaderSno = tagReaderSno;
    }

    public String getTagReaderName() {
        return tagReaderName;
    }

    public void setTagReaderName(String tagReaderName) {
        this.tagReaderName = tagReaderName;
    }


    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public int getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(int alarmType) {
        this.alarmType = alarmType;
    }

    @Override
    public String toString() {
        return "RfidAlarm{" +
                "id=" + id +
                ", projectId='" + projectId + '\'' +
                ", tagSno='" + tagSno + '\'' +
                ", tagName='" + tagName + '\'' +
                ", tagReaderSno='" + tagReaderSno + '\'' +
                ", tagReaderName='" + tagReaderName + '\'' +
                ", alarmType=" + alarmType +
                ", recordTime=" + recordTime +
                '}';
    }
}
