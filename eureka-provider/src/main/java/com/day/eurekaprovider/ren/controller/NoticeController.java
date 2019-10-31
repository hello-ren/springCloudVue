package com.day.eurekaprovider.ren.controller;

import com.day.eurekaprovider.base.util.JsonData;
import com.day.eurekaprovider.ren.model.Notice;
import com.day.eurekaprovider.ren.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private INoticeService noticeService;

    @RequestMapping("list")
    public JsonData list(Notice notice){
        List<Notice> list = noticeService.list(notice);

        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setResult(list);
        return jsonData;
    }

    @RequestMapping("add")
    public JsonData add(Notice notice){
        Integer add = noticeService.add(notice);

        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("模板添加成功！");
        return jsonData;
    }

    @RequestMapping("update")
    public JsonData update(Notice notice){
        Integer update = noticeService.update(notice);

        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("模板添加成功！");
        return jsonData;
    }

    @RequestMapping("del")
    public JsonData del(Notice notice){
        Integer del = noticeService.del(notice);

        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("模板删除成功！");
        return jsonData;
    }

    @RequestMapping("one")
    public JsonData one(Notice notice){
        Notice one = noticeService.one(notice);

        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setResult(one);
        jsonData.setMessage("模板查询成功！");
        return jsonData;
    }
}
