package com.prs.dps.controller;

import com.prs.dps.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ffulauh on 2016/6/20.
 */
@Controller("homeController")
@RequestMapping("/")
public class HomeController {

//    @Autowired
//    IUserService userService;

    @RequestMapping("")
    public String toIndex() throws Exception {
        return "home";
    }

    @RequestMapping("admin")
    public String admin() throws Exception {
        return "admin";
    }

}
