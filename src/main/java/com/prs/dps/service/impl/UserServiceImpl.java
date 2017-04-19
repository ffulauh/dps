package com.prs.dps.service.impl;

import com.prs.dps.dao.IUserDao;
import com.prs.dps.domain.User;
import com.prs.dps.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public int saveUser(User user) throws Exception {
        return userDao.saveUser(user);
    }

    public int updateUser(User user) throws Exception {
        return userDao.updateUser(user);
    }

}
