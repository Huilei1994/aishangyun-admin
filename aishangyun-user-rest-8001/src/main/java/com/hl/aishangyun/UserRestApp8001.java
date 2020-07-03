package com.hl.aishangyun;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;


@SpringBootApplication
@MapperScan(basePackages = {"com.hl.aishangyun.dao"})
public class UserRestApp8001 {
    Logger log = LoggerFactory.getLogger(UserRestApp8001.class);

    @PostConstruct
    void setTimezone() {
        log.warn("服务器Timezone默认时区是：" + TimeZone.getDefault().getID());
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    }

    public static void main(String[] args) {
        SpringApplication.run(UserRestApp8001.class, args);
    }
}
