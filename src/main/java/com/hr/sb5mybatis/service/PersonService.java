package com.hr.sb5mybatis.service;

import com.hr.sb5mybatis.entity.Person;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface PersonService {

    void  add(Person p);
    List<Person> queryAll();
}
