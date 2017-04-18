package com.prs.dps.controller;


import com.prs.dps.service.ITestService;
import com.prs.dps.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URL;
import java.util.List;

/**
 * Created by ffulauh on 2016/6/14.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    IUserService userService;
    //    @Autowired
//    ITestService rmiTestService;
    @Autowired
    HomeController homeController;

//    @Autowired
//    IUserService rmiUserService;

    // inject the actual template
    @Autowired
//    private RedisTemplate<String, String> redisTemplate;
    // inject the template as ListOperations
    // can also inject as Value, Set, ZSet, and HashOperations
//    @Resource(name="redisTemplate")
//    private ListOperations<String, String> listOps;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/showUser")
    @ResponseBody
    public List showUser(HttpServletRequest request, Model model) throws Exception {
        logger.info("我是{}", "韩少华");
        int userId = Integer.valueOf(request.getParameter("id"));
        List<String> userList = userService.getUserById(userId);
        model.addAttribute("user", userList.get(0));

        logger.info("卧槽");
        return userList;
    }

    @RequestMapping("testRmiUserService")
    @ResponseBody
    public List testRmiUserService(HttpServletRequest request, Model model) throws Exception {

        int userId = Integer.valueOf(request.getParameter("id"));
        List<String> userList = userService.getUserById(userId);
        logger.info("卧槽");
//        String test=rmiTestService.test();
        return userList;
    }

    @RequestMapping("/testRedis")
    @ResponseBody
    public String testRedis() throws Exception {
//        URL url = new URL("http","baidu.com",80,"hahn");
//        ListOperations<String, String> listOps = redisTemplate.opsForList();
//        redisTemplate.boundListOps("han").leftPush(url.toExternalForm());
        return null;
    }
}

