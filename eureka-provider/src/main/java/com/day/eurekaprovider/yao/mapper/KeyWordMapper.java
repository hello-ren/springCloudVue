package com.day.eurekaprovider.yao.mapper;

import com.day.eurekaprovider.yao.model.KeyWord;

import java.util.List;

public interface KeyWordMapper {
    int deleteByPrimaryKey(Integer keyId);

    int insert(KeyWord record);

    int insertSelective(KeyWord record);

    KeyWord selectByPrimaryKey(Integer keyId);

    int updateByPrimaryKeySelective(KeyWord record);

    int updateByPrimaryKey(KeyWord record);

    List<KeyWord> list(KeyWord keyWord);

}