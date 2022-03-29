package com.hky.app.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class install {
    private int id;
    private String installAddr;
    private Date installTime;
    private String versionNum;
    private String operater;
}
