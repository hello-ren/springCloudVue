package com.day.eurekaprovider.ren.controller;

import com.day.eurekaprovider.base.util.JsonData;
import com.day.eurekaprovider.ren.model.User;
import com.day.eurekaprovider.ren.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/add")
    @CrossOrigin
    public JsonData add(User user){
        JsonData jsonData=new JsonData();
        userService.add(user);
        jsonData.setCode(0);
        jsonData.setMessage("关注成功！");
        return jsonData;
    }
}
