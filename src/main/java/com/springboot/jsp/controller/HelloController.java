package com.springboot.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guofei.wu
 * @version v3.0
 * @date 2019-09-08 10:44
 * @since v3.0
 */
@Controller
public class HelloController {

    @RequestMapping(value = "suc")
    public String hello(Model model, @RequestParam("name") String name) {
        model.addAttribute("name", name);
        return "success";
    }
}
