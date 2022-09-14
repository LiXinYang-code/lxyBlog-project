package com.lxy.spring.boot.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * backend management controller
 */
@Controller
@RequestMapping("/admins")
public class AdminController {


    /**
     * obtain backend management home page
     * @return
     */
    @GetMapping
    public ModelAndView listUsers(Model model) {
        return new ModelAndView("admins/index", "menuList", model);
    }


}
