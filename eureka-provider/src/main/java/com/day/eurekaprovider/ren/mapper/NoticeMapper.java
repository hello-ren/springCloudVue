package com.day.eurekaprovider.ren.mapper;

import com.day.eurekaprovider.ren.model.Notice;

import java.util.List;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer noId);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer noId);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

    List<Notice> listNotice(Notice notice);
}