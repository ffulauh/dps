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
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

    @Transactional
    @Override
    public User getUserById(Integer id) {
        logger.info("hehehehhew");
        User user1=userDao.getUserById(id);
        user1.setUpdateByEmail(1);
        int i= userDao.updateUser(user1);
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

    //可重复读测试,不能发生不可重复读
//    @Transactional(isolation = Isolation.REPEATABLE_READ)
//    public int updateUser(User user) {
//        User han = userDao.getUserById(user.getId());
//        sqlSessionTemplate.clearCache();
//        User han2 = userDao.getUserById(user.getId());
//        System.out.println("hehe");
//        user.setUpdateByEmail(1);
//        int i= userDao.updateUser(user);
//        System.out.println("hehe");
//        return 1;
//    }


//    //读提交测试
//    @Transactional(isolation = Isolation.READ_COMMITTED)
//    public int updateUser(User user) {
//        User han = userDao.getUserById(user.getId());
//        sqlSessionTemplate.clearCache();
//        User han2 = userDao.getUserById(user.getId());
//        System.out.println("hehe");
//        user.setUpdateByEmail(1);
//        int i= userDao.updateUser(user);
//        System.out.println("hehe");
//        return 1;
//    }
    //解决抢单问题
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public int updateUser(User user) {
        System.out.println("hehe");
        synchronized (this){
            User han = userDao.getUserById(user.getId());
            if(han.getUpdateByEmail().equals(0)){
                user.setUpdateByEmail(1);
                int i= userDao.updateUser(user);
            }
        }
        System.out.println("hehe");
        return 1;
    }

}
