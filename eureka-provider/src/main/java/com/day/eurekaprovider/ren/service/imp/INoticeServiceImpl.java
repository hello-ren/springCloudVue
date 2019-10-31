package com.day.eurekaprovider.ren.service.imp;

import com.day.eurekaprovider.ren.mapper.NoticeMapper;
import com.day.eurekaprovider.ren.model.Notice;
import com.day.eurekaprovider.ren.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class INoticeServiceImpl implements INoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public Integer update(Notice notice) {
        return noticeMapper.updateByPrimaryKeySelective(notice);
    }

    @Override
    public Integer add(Notice notice) {
        return noticeMapper.insert(notice);
    }

    @Override
    public Integer del(Notice notice) {
        return noticeMapper.deleteByPrimaryKey(notice.getNoId());
    }

    @Override
    public Notice one(Notice notice) {
        return noticeMapper.selectByPrimaryKey(notice.getNoId());
    }

    @Override
    public List<Notice> list(Notice notice) {
        return noticeMapper.listNotice(notice);
    }
}
