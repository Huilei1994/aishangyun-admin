package com.hl.aishangyun;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * @ClassName GatewayApplication8000
 * @Description TODO
 * @Date 2020/7/3 13:56
 * @Created by 胡磊
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.hl.aishangyun.service"})
public class GatewayApplication8000 {

    Logger log = LoggerFactory.getLogger(GatewayApplication8000.class);

    @PostConstruct
    void setTimezone() {
        log.warn("服务器Timezone默认时区是：" + TimeZone.getDefault().getID());
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication8000.class, args);
    }
}
