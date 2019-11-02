package com.day.eurekaprovider.yao.controller;


import com.day.eurekaprovider.base.util.JsonData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping
    public JsonData hello() {
        JsonData jsonData = new JsonData();
        return jsonData;
    }

}
