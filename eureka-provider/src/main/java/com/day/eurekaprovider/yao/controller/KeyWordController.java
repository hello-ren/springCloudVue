package com.day.eurekaprovider.yao.controller;

import com.day.eurekaprovider.base.util.JsonData;
import com.day.eurekaprovider.base.util.PageBean;
import com.day.eurekaprovider.yao.model.KeyWord;
import com.day.eurekaprovider.yao.service.IKeyWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/keyWord")
public class KeyWordController {

    @Autowired
    private IKeyWordService keyWordService;

    @CrossOrigin // 注解方式
    @RequestMapping("/list")
    public JsonData list(KeyWord keyWord, PageBean pageBean){
        List<KeyWord> list = keyWordService.list(keyWord, pageBean);
        JsonData jsonData = new JsonData();
        jsonData.put("list", list);

        jsonData.put("page", pageBean.getPage());
        jsonData.put("rows", pageBean.getRows());
        jsonData.put("total", pageBean.getTotal());
        return jsonData;
    }
}
