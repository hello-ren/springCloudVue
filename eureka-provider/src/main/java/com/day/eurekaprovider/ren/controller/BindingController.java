package com.day.eurekaprovider.ren.controller;

import com.day.eurekaprovider.base.util.JsonData;
import com.day.eurekaprovider.base.util.PageBean;
import com.day.eurekaprovider.ren.model.Binding;
import com.day.eurekaprovider.ren.service.IBindingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/binding")
public class BindingController {

    @Autowired
    IBindingService bindingService;

    @RequestMapping("list")
    @CrossOrigin
    public JsonData list(Binding binding, PageBean p){
        JsonData jsonData=new JsonData();

        List<Binding> list = bindingService.list(binding,p);
        jsonData.setTotal(p.getTotal());
        jsonData.setPage(p.getPage());
        jsonData.setRows(p.getRows());
        jsonData.setResult(list);

        return jsonData;
    }

    @RequestMapping("add")
    @CrossOrigin
    public JsonData add(Binding binding){
        JsonData jsonData=new JsonData();
        bindingService.add(binding);
        jsonData.setCode(0);
        jsonData.setMessage("绑定成功！！");
        return jsonData;
    }

}
