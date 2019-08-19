package com.codurance.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}", method = GET)
    @ResponseBody
    public User getUser(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
