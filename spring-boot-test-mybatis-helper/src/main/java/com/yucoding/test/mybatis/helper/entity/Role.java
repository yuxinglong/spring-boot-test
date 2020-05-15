package com.yucoding.test.mybatis.helper.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@TableName("orm_role")
@Accessors(chain=true)
@EqualsAndHashCode(callSuper = true)
public class Role extends Model<Role> {

    private Long id;
    private String name;

    @Override
    protected Serializable pkVal() {

        return this.id;
    }
}
