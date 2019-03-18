package com.hr.sb5mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.hr.sb5mybatis.dao")
@Cacheable
public class Sb5mybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sb5mybatisApplication.class, args);
    }

}
