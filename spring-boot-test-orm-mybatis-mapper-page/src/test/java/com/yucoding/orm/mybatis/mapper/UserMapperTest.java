package com.yucoding.orm.mybatis.mapper;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.SecureUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yucoding.orm.mybatis.SpringBootTestApplication;
import com.yucoding.orm.mybatis.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class UserMapperTest extends SpringBootTestApplication {

    @Autowired
    private UserMapper userMapper;



    @Test
    public void testInsertList() {
        List<User> userList = Lists.newArrayList();
        for (int i = 4; i < 14; i++) {
            String salt = IdUtil.fastSimpleUUID();
            User user = User.builder().name("testSave" + i).password(SecureUtil.md5("123456" + salt)).salt(salt).email("testSave" + i + "@xkcoding.com").phoneNumber("1730000000" + i).status(1).lastLoginTime(new DateTime()).createTime(new DateTime()).lastUpdateTime(new DateTime()).build();
            userList.add(user);
        }
        int i = userMapper.insertList(userList);
        Assert.assertEquals(userList.size(), i);
        List<Long> ids = userList.stream().map(User::getId).collect(Collectors.toList());
        System.out.println("【测试主键回写#userList.ids】= "+ids);
    }

    @Test
    public void testQueryByPageAndSort() {
        //initData();
        int currentPage = 1;
        int pageSize = 5;
        String orderBy = "id desc";
        int count = userMapper.selectCount(null);
        PageHelper.startPage(currentPage, pageSize, orderBy);
        List<User> users = userMapper.selectAll();
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        //Assert.assertEquals(5, userPageInfo.getSize());
        //Assert.assertEquals(count, userPageInfo.getTotal());
        System.out.println("【userPageInfo】= "+ userPageInfo);
    }

    private void initData() {
        testInsertList();
    }
}
