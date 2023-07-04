package org.example.controller;


import org.example.param.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping(value = "/login")
    public @ResponseBody String login(@RequestBody User user) {
        if(user == null){
            return "入参不合法";
        }
        if(!user.getUsername().equals("nifangjie")){
            return "用户名不正确";
        }

        if(!user.getPassword().equals("5495")){
            return "密码不正确";
        }

        return "success!";
    }

    @RequestMapping(value = "/password")
    public @ResponseBody String password() {
        return "password!";
    }
}
