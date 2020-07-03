package com.hl.aishangyun.service.impl;


import com.hl.aishangyun.dao.UserDao;
import com.hl.aishangyun.pojo.dto.ResponseDTO;
import com.hl.aishangyun.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName UserServiceImpl
 * @Description 用户操作业务实现层
 * @Date 2020/7/3 13:25
 * @Created by 胡磊
 */
@Service
public class UserServiceImpl implements UserService {


    @Resource
    UserDao userDao;

    /**
     * 根据用户主键id查找用户信息
     * @param id
     * @return
     */
    @Override
    public ResponseDTO findUserById(Long id) {
        return ResponseDTO.get(userDao.selectByPrimaryKey(id));
    }
}
