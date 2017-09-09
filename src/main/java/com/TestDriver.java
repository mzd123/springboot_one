package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/5/27.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.mapper")
public class TestDriver {
    public static void main(String[] args) {
        SpringApplication.run(TestDriver.class, args);
    }
}

