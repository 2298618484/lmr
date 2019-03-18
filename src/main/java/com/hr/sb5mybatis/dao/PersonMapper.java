package com.hr.sb5mybatis.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.sb5mybatis.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonMapper extends BaseMapper<Person>{
    List<Person> queryA();
}