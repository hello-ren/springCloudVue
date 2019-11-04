package com.day.eurekaprovider.ren.service;

import com.day.eurekaprovider.ren.model.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserService {

    public int add(User user);

    public User one(User user);
}
