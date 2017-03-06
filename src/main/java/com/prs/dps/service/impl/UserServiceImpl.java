package com.prs.dps.service.impl;

import com.prs.dps.controller.HomeController;
import com.prs.dps.dao.IUserDao;
import com.prs.dps.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ffulauh on 2016/6/4.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;


    public List<String> getUserById(Integer id) throws Exception {
        return userDao.getUserById(id);
    }
}
