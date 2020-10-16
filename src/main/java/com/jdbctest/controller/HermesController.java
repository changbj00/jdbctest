package com.jdbctest.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.jdbctest.service.Hermes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class HermesController {
    @Autowired
    Hermes hermes;
    @Autowired
    JdbcTemplate jdbcTemplate;

    //@DS(value = "hermes")
//    @GetMapping("/hermes")
//    @ResponseBody
//    public List<Map<String, Object>> find1(){
//        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from hermes_id");
//        return  list;
//    }
    @PostMapping("/hermes")
    //@DS(value = "hermes")
    public List gethermes(@Validated String key,@Validated String value,@Validated String table){
        log.info("输入参数{},{},{}",key,value,table);
        List list=hermes.selecthermes(key,value,table);
        log.info("查询结果{}",list.toString());
        return list;
    }
}
