package com.hl.aishangyun.dao;


import com.hl.aishangyun.pojo.entity.User;

public interface UserDao {

    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}