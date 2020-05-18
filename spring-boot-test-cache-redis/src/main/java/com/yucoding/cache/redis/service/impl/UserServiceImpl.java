package com.yucoding.cache.redis.service.impl;

import com.google.common.collect.Maps;
import com.yucoding.cache.redis.entity.User;
import com.yucoding.cache.redis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private static final Map<Long,User> DATABASES = Maps.newConcurrentMap();

    static{
        DATABASES.put(1L, new User(1L, "user10"));
        DATABASES.put(2L, new User(2L, "user20"));
        DATABASES.put(3L, new User(3L, "user30"));

    }

    @CachePut(value = "user",key="#user.id")
    @Override
    public User saveOrUpdate(User user) {
        DATABASES.put(user.getId(),user);
        log.error("**********保存用户【user】= {}", user);
        return user;
    }

    @Cacheable(value = "user",key="#id")
    @Override
    public User get(Long id) {
        log.error("**********查询用户【id】= {}", id);
        return DATABASES.get(id);
    }

    @CacheEvict(value = "user",key="#id")
    @Override
    public void delete(Long id) {
        DATABASES.remove(id);
        log.error("删除用户【id】= {}", id);

    }
}
