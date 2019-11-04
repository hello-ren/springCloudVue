package com.day.eurekaprovider.ren.service;

import com.day.eurekaprovider.base.util.PageBean;
import com.day.eurekaprovider.ren.model.Notice;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface INoticeService {

    public Integer update(Notice notice);
    public Integer add(Notice notice);
    public Integer del(Notice notice);
    public Notice one(Notice notice);

    @Transactional(readOnly = true)
    public List<Notice> list(Notice notice, PageBean pageBean);

}
