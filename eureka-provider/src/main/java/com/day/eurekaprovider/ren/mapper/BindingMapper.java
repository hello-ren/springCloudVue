package com.day.eurekaprovider.ren.mapper;

import com.day.eurekaprovider.ren.model.Binding;

import java.util.List;

public interface BindingMapper {
    int deleteByPrimaryKey(Integer binId);

    int insert(Binding record);

    int insertSelective(Binding record);

    Binding selectByPrimaryKey(Integer binId);

    int updateByPrimaryKeySelective(Binding record);

    int updateByPrimaryKey(Binding record);

    List<Binding> list(Binding binding);
}