package com.yucoding.test.mybatis.helper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yucoding.test.mybatis.helper.entity.User;
import com.yucoding.test.mybatis.helper.mapper.UserMapper;
import com.yucoding.test.mybatis.helper.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
