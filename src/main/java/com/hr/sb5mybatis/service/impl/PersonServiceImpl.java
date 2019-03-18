package com.hr.sb5mybatis.service.impl;

import com.hr.sb5mybatis.dao.PersonMapper;
import com.hr.sb5mybatis.entity.Person;
import com.hr.sb5mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper pm;

    @Override
    @CacheEvict(value = "lhl",key = "'PersonService.queryAll'")
    public void add(Person p) {
        pm.insert(p);
    }

    @Cacheable(value = "lhl",key = "'PersonService.queryAll'")
    public List<Person> queryAll(){
     //  Map<String, Object> map = new HashMap<>();
      //  List<Person> list = pm.selectByMap(map);
        List<Person> list = pm.queryA();
        return  list;
    }
}
