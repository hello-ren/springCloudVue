package com.day.eurekaprovider.yao.service.impl;

import com.day.eurekaprovider.base.util.PageBean;
import com.day.eurekaprovider.yao.mapper.KeyWordMapper;
import com.day.eurekaprovider.yao.model.KeyWord;
import com.day.eurekaprovider.yao.service.IKeyWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KeyWordServiceImpl implements IKeyWordService {

    @Autowired
    private KeyWordMapper keyWordMapper;

    @Override
    public List<KeyWord> list(KeyWord keyWord, PageBean pageBean) {
        return keyWordMapper.list(keyWord);
    }

}
