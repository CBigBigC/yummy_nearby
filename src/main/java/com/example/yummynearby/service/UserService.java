package com.example.yummynearby.service;

import com.example.yummynearby.dao.UserDao;
import com.example.yummynearby.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author watson
 * @date 2022/4/28 1:55 PM
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User getUserById(long id){
        return userDao.getUserById(id);
    }
}
