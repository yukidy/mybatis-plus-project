package com.txd.study.mybatis.plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.txd.study.mybatis.plus.mapper")
public class MybatisPlusProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusProjectApplication.class, args);
    }

}
