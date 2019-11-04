package com.day.eurekaprovider.ren.service;

import com.day.eurekaprovider.base.util.PageBean;
import com.day.eurekaprovider.ren.model.Binding;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBindingService {

    public int add(Binding binding);

    public List<Binding> list(Binding binding, PageBean pageBean);
}
