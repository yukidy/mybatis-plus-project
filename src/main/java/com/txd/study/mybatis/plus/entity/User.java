package com.txd.study.mybatis.plus.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: 唐晓东
 * @since: 19:22 2021/7/12
 * @version: v1.0
 * @description:
 */
@Data
@Accessors(chain = true)
public class User {

    private Long id;

    private String name;

    private Integer age;

    private String email;

}
