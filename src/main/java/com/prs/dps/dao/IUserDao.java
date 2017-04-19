package com.prs.dps.dao;

import com.prs.dps.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ffulauh on 2016/6/4.
 */
@Repository("userDao")
public interface IUserDao {

    List<String> getUserById(Integer id) throws Exception;

    int saveUser(User user) throws Exception;

    int updateUser(User user) throws Exception;
}