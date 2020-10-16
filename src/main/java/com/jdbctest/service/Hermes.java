package com.jdbctest.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.jdbctest.mapper.HermesMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class Hermes {
    @Autowired
    HermesMapper hermesMapper;

    @DS("hermes")
    public List selecthermes(String key, String value, String table) {
        List list = hermesMapper.selecthermes(table, key, value);
        log.info("查询结果{}", list.toString());
        return list;
    }
}
