package com.yucoding.cache.redis.service;

import com.yucoding.cache.redis.entity.User;

public interface UserService {

    User saveOrUpdate(User user);

    User get(Long id);

    void delete(Long id);
}
