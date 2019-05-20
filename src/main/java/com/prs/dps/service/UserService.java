package com.prs.dps.service;


import com.prs.dps.domain.User;

import java.util.List;

/**
 * Created by ffulauh on 2016/6/4.
 */
public interface UserService {

    User getUserById(Integer id);
    User getUserByIdNonTransaction(Integer id);

    int saveUser(User user);

    int updateUser(User user);
}
