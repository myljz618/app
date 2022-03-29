package com.hky.app.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class version {
    private int versionId;
    private String versionNum;
    private String versionDesc;
    private int versionStatus;
    private Date updateTime;
}
