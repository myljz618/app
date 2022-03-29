package com.hky.app.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
@ConfigurationProperties(prefix = "show")
public class show {
    @Value("1024")
    private Integer id;
    @Value("beijingshow")
    private String showName;
    @Value("beijign ")
    private String showLocal;
    private Date showTime;
}
