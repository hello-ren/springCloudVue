package com.day.eurekaprovider.ren.controller;

import com.day.eurekaprovider.base.util.JsonData;
import com.day.eurekaprovider.base.util.PageBean;
import com.day.eurekaprovider.ren.model.Notice;
import com.day.eurekaprovider.ren.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private INoticeService noticeService;

    @RequestMapping("list")
    @CrossOrigin
    public JsonData list(Notice notice,PageBean p){
        List<Notice> list = noticeService.list(notice,p);

        JsonData jsonData=new JsonData();
        jsonData.setTotal(p.getTotal());
        jsonData.setPage(p.getPage());
        jsonData.setRows(p.getRows());
        jsonData.setResult(list);
        return jsonData;
    }

    @RequestMapping("addUpdate")
    @CrossOrigin
    public JsonData addUpdate(Notice notice){
        notice.setNoUserId(1);
        notice.setNoState(0);
        if(null!=notice.getNoId()){
            Integer update = noticeService.update(notice);
        }else{
            Integer add = noticeService.add(notice);

        }

        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("操作成功！");
        return jsonData;
    }


    @RequestMapping("del")
    @CrossOrigin
    public JsonData del(Notice notice){
        Integer del = noticeService.del(notice);

        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setMessage("模板删除成功！");
        return jsonData;
    }

    @RequestMapping("one")
    @CrossOrigin
    public JsonData one(Notice notice){
        Notice one = noticeService.one(notice);

        JsonData jsonData=new JsonData();
        jsonData.setCode(0);
        jsonData.setResult(one);
        jsonData.setMessage("模板查询成功！");
        return jsonData;
    }
}
