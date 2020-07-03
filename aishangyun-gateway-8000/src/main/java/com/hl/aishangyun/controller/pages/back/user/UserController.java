package com.hl.aishangyun.controller.pages.back.user;


import com.hl.aishangyun.pojo.dto.ResponseDTO;
import com.hl.aishangyun.service.UserServiceFeign;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserController
 * @Description 这是feign代理的User服务提供的接口
 * @Date 2020/7/3 13:59
 * @Created by 胡磊
 */
@RestController
@RequestMapping("/back/user")
public class UserController {

    @Resource
    UserServiceFeign userServiceFeign;


    @RequestMapping("findUserById/{id}")
    ResponseDTO findUserById(@PathVariable Long id) {
        //模仿User-rest就可以了
        return userServiceFeign.findUserById(id);
    }
}
