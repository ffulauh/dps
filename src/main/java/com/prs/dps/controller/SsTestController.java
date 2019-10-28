package com.prs.dps.controller;

import com.prs.dps.domain.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class SsTestController extends AbstractController{
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<User> userList=new ArrayList<>();
        User user1=new User();
        user1.setUsername("han");
        User user2=new User();
        user2.setUsername("seteve");
        userList.add(user1);
        userList.add(user2);
        return new ModelAndView("userList","users",userList);
    }
}
