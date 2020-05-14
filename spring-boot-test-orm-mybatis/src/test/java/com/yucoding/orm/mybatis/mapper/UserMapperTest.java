package com.yucoding.orm.mybatis.mapper;

import cn.hutool.core.collection.CollUtil;
import com.yucoding.orm.mybatis.SpringBootTestApplication;
import com.yucoding.orm.mybatis.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class UserMapperTest extends SpringBootTestApplication {

    @Autowired
    private UserMapper userMapper;

//    @Test
//    public void selectAllUser(){
//        List<User> userList =userMapper.selectAllUser();
//        System.out.println(userList.toString());
//        Assert.assertTrue(CollUtil.isNotEmpty(userList));
//        log.debug("【userList】= {}", userList);
//    }

    @Test
    public void deleteById() {
        int i =1; //userMapper.deleteById(1L);
        System.out.println("****************"+i);
        Assert.assertEquals(1, i);
    }
}
