package com.prs.dps.controller;


import com.prs.dps.service.IPoetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by ffulauh on 2016/6/14.
 */
@Controller
@RequestMapping("poet")
public class PoetController {
    @Autowired
    IPoetService poetService;

    @RequestMapping("/showPoet")
    public String showPoet(HttpServletRequest request, Model model) throws Exception {

        int poetId = Integer.valueOf(request.getParameter("id"));
        List<String> poetList = poetService.getPoetById(poetId);
        model.addAttribute("poet", poetList.get(0));

        return "showPoet";
    }
}
