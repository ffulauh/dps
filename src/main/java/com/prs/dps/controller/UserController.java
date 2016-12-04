package com.prs.dps.controller;


import com.prs.dps.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by ffulauh on 2016/6/14.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    IUserService userService;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/showUser")
    @ResponseBody
    public List showPoet(HttpServletRequest request, Model model) throws Exception {

        int userId = Integer.valueOf(request.getParameter("id"));
        List<String> userList = userService.getUserById(userId);
        model.addAttribute("user", userList.get(0));

        logger.info("卧槽");
        return userList;
    }
}
