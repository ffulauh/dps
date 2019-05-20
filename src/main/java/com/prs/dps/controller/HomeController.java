package com.prs.dps.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ffulauh on 2016/6/20.
 */
@Controller("homeController")
@RequestMapping("/")
public class HomeController {

    private static final Logger logger= LoggerFactory.getLogger(HomeController.class);

//    @Autowired
//    UserService userService;

    @RequestMapping("")
    public String toIndex() throws Exception {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        return "home";
    }

    @RequestMapping("admin")
    public String admin() throws Exception {
        return "admin";
    }

}
