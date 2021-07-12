package com.txd.study.mybatis.plus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.txd.study.mybatis.plus.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * @author: 唐晓东
 * @since: 19:26 2021/7/12
 * @version: v1.0
 * @description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    // 继承BaseMapper可以省去编写xml，也可通过xml编写复制sql语句
}
