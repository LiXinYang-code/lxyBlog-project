package com.lxy.spring.boot.blog.controller;


import com.lxy.spring.boot.domain.User;
import com.lxy.spring.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

/**
 * User Controller
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * query all users
     * @param model
     * @return
     */
    @GetMapping
    public ModelAndView list(Model model){

        model.addAttribute("userList", userRepository.findAll());
        model.addAttribute("title","用户管理");
        return  new ModelAndView("users/list","userModel",model);

    }

    /**
     * query user by id
     * @param model
     * @return
     */
    @GetMapping("{id}")
    public ModelAndView view(@PathVariable("id") Long id, Model model){

        User user = userRepository.findById(id).orElse(null);
        model.addAttribute("user",user);
        model.addAttribute("title","查看用户");
        return  new ModelAndView("users/view","userModel",model);

    }

    /**
     * obtain and create form page
     * @param model
     * @return
     */
    @GetMapping("/form")
    public ModelAndView createForm(Model model){

        model.addAttribute("user",new User(null,null,null));
        model.addAttribute("title","创建用户");
        return  new ModelAndView("users/form","userModel",model);

    }

    /**
     * Create users or update users
     * @param user
     * @return
     */
    @PostMapping
    public  ModelAndView saveOrUpdateUser(User user){

         userRepository.save(user);
        return  new ModelAndView("redirect:/users");

    }

    /**
     * delete the specific user
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") Long id){

        userRepository.deleteById(id);
        return new ModelAndView("redirect:/users");//redirect to the users page

    }

    /**
     * modify the user`s page
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/modify/{id}")
    public  ModelAndView modify(@PathVariable("id") Long id,Model model){

        User user = userRepository.findById(id).orElse(null);
        model.addAttribute("user",user);
        model.addAttribute("title","修改用户");
        return new ModelAndView("users/form","userModel",model);

    }



}
