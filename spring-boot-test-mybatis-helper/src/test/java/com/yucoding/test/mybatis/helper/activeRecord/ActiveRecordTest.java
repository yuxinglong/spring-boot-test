package com.yucoding.test.mybatis.helper.activeRecord;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.yucoding.test.mybatis.helper.SpringBootTestApplication;
import com.yucoding.test.mybatis.helper.entity.Role;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

@Slf4j
public class ActiveRecordTest extends SpringBootTestApplication {

    @Test
    public void testActiveRecordInsert() {
        Role role = new Role();
        role.setName("VIP");
        Assert.assertTrue(role.insert());
        // 成功直接拿会写的 ID
        log.debug("【role】= {}", role);
    }

    @Test
    public void testActiveRecordUpdate() {
        Assert.assertTrue(new Role().setId(1L).setName("管理员-1").updateById());
        Assert.assertTrue(new Role().update(new UpdateWrapper<Role>().lambda().set(Role::getName, "普通用户-1").eq(Role::getId, 2)));
    }
}
