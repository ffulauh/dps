package com.prs.dps.service;


import com.prs.dps.domain.User;

import java.util.List;

/**
 * Created by ffulauh on 2016/6/4.
 */
public interface IUserService {

    List<String> getUserById(Integer id) throws Exception;

    int saveUser(User user) throws Exception;

    int updateUser(User user) throws Exception;
}
