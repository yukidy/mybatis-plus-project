package com.txd.study.mybatis.plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.txd.study.mybatis.plus.entity.User;
import com.txd.study.mybatis.plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisPlusProjectApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testSelectOne() {
        User user = new User()
                .setName("Mr.唐")
                .setAge(24)
                .setEmail("8937182@qq.com");
        userMapper.insert(user);

        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();

    }


    @Test
    void testList() {

    }

}
