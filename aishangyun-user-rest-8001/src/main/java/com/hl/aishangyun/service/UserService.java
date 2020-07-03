package com.hl.aishangyun.service;


import com.hl.aishangyun.pojo.dto.ResponseDTO;

/**
 * @ClassName UserService
 * @Description TODO
 * @Date 2020/7/3 13:24
 * @Created by 胡磊
 */
public interface UserService {

    ResponseDTO findUserById(Long id);
}
