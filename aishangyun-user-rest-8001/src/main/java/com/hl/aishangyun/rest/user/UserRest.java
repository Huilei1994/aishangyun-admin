package com.hl.aishangyun.rest.user;


import com.hl.aishangyun.pojo.dto.ResponseDTO;
import com.hl.aishangyun.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName UserRest
 * @Description TODO
 * @Date 2020/7/3 13:24
 * @Created by 胡磊
 */
@RestController
@RequestMapping("user")
public class UserRest {

    @Resource
    UserService userService;

    @RequestMapping("findUserById/{id}")
    ResponseDTO findUserById(@PathVariable Long id) {
        return userService.findUserById(id);
    }

}
