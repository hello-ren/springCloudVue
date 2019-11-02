package com.day.eurekaprovider.yao.service;

import com.day.eurekaprovider.base.util.PageBean;
import com.day.eurekaprovider.yao.model.KeyWord;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IKeyWordService {

    @Transactional(readOnly = true)
    List<KeyWord> list(KeyWord keyWord, PageBean pageBean);

}
