package com.hl.aishangyun.service;

import com.hl.aishangyun.config.feign.FeignClientConfig;
import com.hl.aishangyun.pojo.dto.PageDTO;
import com.hl.aishangyun.pojo.dto.ResponseDTO;
import com.hl.aishangyun.pojo.query.UserQuery;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @InterfaceName UserServiceFeign
 * @Description Feign接口代理
 * @Date 2020/7/3 14:03
 * @Created by 胡磊
 */
@FeignClient(value = "user-rest", path = "user", configuration = FeignClientConfig.class)
public interface UserServiceFeign {

    /**
     * @param id 用户的id
     * @return 返回用户的信息
     */

    @RequestMapping("/findUserById/{id}")
    ResponseDTO findUserById(@PathVariable Long id);// 第一种路径传参

    /**
     * 对用户进行分页查询
     * 参数：
     * @param query
     * @return
     */
    @RequestMapping("/listUser")
    PageDTO listUser(UserQuery query);// 第二种：最喜欢 post里边body放的参数


}
