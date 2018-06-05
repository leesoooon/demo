package com.cn.hnust.service.impl;

import com.cn.hnust.mapper.UserMapper;
import com.cn.hnust.model.User;
import com.cn.hnust.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lee
 * @version 2018-06-05 19:06
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    private static Logger log = Logger.getLogger(UserServiceImpl.class);

    @Resource
    private UserMapper userMapper;

    public User getUserById(int userId) {
        log.info("InParam : userId = " + userId);
        return userMapper.selectByPrimaryKey(userId);
    }
}
