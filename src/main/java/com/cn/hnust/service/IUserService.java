package com.cn.hnust.service;


import com.cn.hnust.model.User;

/**
 * @author Lee
 * @version 2018-06-05 19:06
 */
public interface IUserService {
    User getUserById(final int userId);
}
