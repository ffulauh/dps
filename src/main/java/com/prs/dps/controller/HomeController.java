package com.prs.dps.controller;

import com.prs.dps.service.IPoetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ffulauh on 2016/6/20.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired IPoetService poetService;

    @RequestMapping("")
    public String toIndex() throws Exception{
        return "home";
    }
}
