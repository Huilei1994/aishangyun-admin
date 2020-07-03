package com.hl.aishangyun.config.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * creator：杜夫人
 * date: 2020/7/3
 */
@SpringBootConfiguration
public class DataSourceConfig {
    @Bean
    DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setUrl("jdbc:mysql://120.25.223.121:3306/szp_db_test?serverTimezone=Asia/Shanghai");
        return druidDataSource;
    }


    // 再这里配置mybatis：


}
