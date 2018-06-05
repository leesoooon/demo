package com.cn.hnust.mapper;

import com.cn.hnust.model.User;

/**
 * @author Lee
 * @version 2018-06-05 19:06
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}