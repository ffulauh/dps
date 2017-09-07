package com.prs.dps.controller;


import com.prs.dps.common.constants.Constants;
import com.prs.dps.common.controller.BaseController;
import com.prs.dps.common.controller.Result;
import com.prs.dps.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ffulauh on 2016/6/14.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public Result showUser(int id) throws Exception {
        Result result=new Result();
        logger.info(result.toString());
        List<String> userList = userService.getUserById(id);
        result.setData(id);
        result.setResultCode(Constants.SUCCESS);
        return result;
    }

}

