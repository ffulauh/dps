package com.prs.dps.service.impl;

import com.prs.dps.dao.UserDao;
import com.prs.dps.domain.User;
import com.prs.dps.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.ListOperations;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ffulauh on 2016/6/4.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    @Autowired
    private UserDao userDao;
    @Autowired
    private SqlSession sqlSessionTemplate;
//
//    // inject the actual template
//    @Autowired
//    private RedisTemplate<String, String> template;

//    @Resource(name="redisTemplate")
//    private ListOperations<String, String> listOps;

    @Transactional(readOnly = true)
    @Override

    public User getUserById(Integer id) {
        logger.info("hehehehhew");
        User user1=userDao.getUserById(id);
        User user2=userDao.getUserById(id);
        UserDao userDao2=sqlSessionTemplate.getMapper(UserDao.class);
        User user3=userDao.getUserById(id);
        User user4=userDao2.getUserById(id);
        User user5=userDao2.getUserById(id);
        return user1;
    }

    @Override
    public User getUserByIdNonTransaction(Integer id) {
        logger.info("hehehehhew");
        User user6=userDao.getUserById(id);
        User user7=userDao.getUserById(id);
        UserDao userDao2=sqlSessionTemplate.getMapper(UserDao.class);
        User user8=userDao2.getUserById(id);

        return user6;
    }

    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

}
