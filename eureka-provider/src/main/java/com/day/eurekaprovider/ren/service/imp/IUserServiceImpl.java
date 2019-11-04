package com.day.eurekaprovider.ren.service.imp;

import com.day.eurekaprovider.ren.mapper.UserMapper;
import com.day.eurekaprovider.ren.model.User;
import com.day.eurekaprovider.ren.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int add(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User one(User user) {
        return userMapper.selectByPrimaryKey(user.getuId());
    }
}
