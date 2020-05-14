package com.yucoding.orm.mybatis.mapper;

import com.yucoding.orm.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    @Select("SELECT * FROM orm_user")
    List<User> selectAllUser();

    @Select("SELECT * FROM orm_user where id=#{id}")
    User selectUserById(@Param("id")Long id);

    int saveUser(@Param("user")User user);

    int deleteById(@Param("id") Long id);
}
