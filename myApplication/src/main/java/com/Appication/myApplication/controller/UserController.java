package com.Appication.myApplication.controller;

import com.Appication.myApplication.entity.User;
import com.Appication.myApplication.request.UserRequest;
import com.Appication.myApplication.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping(value = "/api/v1")
public class UserController {

    private final IUserService iUserService;

    @Autowired
    public UserController(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @PostMapping("/users")
    public String saveUser(@RequestBody UserRequest request) throws Exception {
       User user = iUserService.addUser(request);
       return "User created successful";
    }
}
