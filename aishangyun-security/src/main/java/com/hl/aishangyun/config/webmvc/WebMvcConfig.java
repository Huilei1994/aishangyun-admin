package com.hl.aishangyun.config.webmvc;


import com.hl.aishangyun.config.interceptor.PrincipalValidate;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @ClassName WebMvcConfig
 * @Description TODO
 * @Date 2020/7/3 15:31
 * @Created by 胡磊
 */
@Configuration
public class WebMvcConfig  implements WebMvcConfigurer {


    @Resource
    PrincipalValidate principalValidate;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(principalValidate);
    }

}
