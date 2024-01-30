package com.Jwt.Auth.Controller;

import com.Jwt.Auth.Model.UserModel;
import com.Jwt.Auth.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<UserModel> getUserList() {
        return this.userService.getUserModelList();
    }
}
