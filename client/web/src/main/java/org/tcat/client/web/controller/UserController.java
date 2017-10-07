package org.tcat.client.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tcat.service.user.service.UserServiceRemote;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceRemote userService;

    @GetMapping("test")
    public Object test() {
        return userService.test();
    }

}
