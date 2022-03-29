package com.hky.app.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class client {
    private Integer clientID;
    private String clientName;
    private Integer clientPhone;
    private String clientAddress;
    private String clientOffice;
    private Integer sex;
    private Date registerTime;
}
