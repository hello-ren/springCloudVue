package com.day.eurekaprovider.ren.service.imp;

import com.day.eurekaprovider.base.util.PageBean;
import com.day.eurekaprovider.ren.mapper.BindingMapper;
import com.day.eurekaprovider.ren.model.Binding;
import com.day.eurekaprovider.ren.service.IBindingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IBindingServiceImpl implements IBindingService {
    @Autowired
    private BindingMapper bindingMapper;

    @Override
    public int add(Binding binding) {
        return bindingMapper.insert(binding);
    }

    @Override
    public List<Binding> list(Binding binding, PageBean pageBean) {
//        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
        List<Binding> list = bindingMapper.list(binding);
//        PageInfo<Binding> pageInfo=new PageInfo(list);
        return list;
    }
}
