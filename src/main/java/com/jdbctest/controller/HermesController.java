package com.jdbctest.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.jdbctest.service.Hermes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/jdbc")
public class HermesController {
    @Autowired
    Hermes hermes;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @DS(value = "hermes")
    @PostMapping("/hermes")
    @ResponseBody
    public List<Map<String, Object>> hermes(String table, String[] key, String[] value, String sql) {
        sql = sqlcheck(table, key, value, sql);
        log.info("sql{}", sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    private String sqlcheck(String table, String[] key, String[] value, String sql) {
        if (sql == "" || sql == null) {
            sql = "select * from " + table + " where ";
            if (key.length == value.length) {
                for (int i = 0; i < key.length; i++) {
                    if (i == 0) {
                        sql = sql + key[i] + " = " + value[i];
                    } else {
                        sql = sql + " and " + key[i] + " = " + value[i];

                    }
                    log.info(sql);
                }
            }
        }
        return sql;
    }
    @DS(value = "spore")
    @PostMapping("/spore")
    @ResponseBody
    public List<Map<String, Object>> spore(String table, String[] key, String[] value,String sql) {
        sql = sqlcheck(table, key, value, sql);
        log.info("sql{}", sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @DS(value = "orion")
    @PostMapping("/orion")
    @ResponseBody
    public List<Map<String, Object>> orion(String table, String[] key, String[] value,String sql) {
        sql = sqlcheck(table, key, value, sql);
        log.info("sql{}", sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @DS(value = "showengines")
    @PostMapping("/showengines")
    @ResponseBody
    public List<Map<String, Object>> showengines(String table, String[] key, String[] value,String sql) {
        sql = sqlcheck(table, key, value, sql);
        log.info("sql{}", sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @DS(value = "brsender")
    @PostMapping("/brsender")
    @ResponseBody
    public List<Map<String, Object>> brsender(String table, String[] key, String[] value,String sql) {
        sql = sqlcheck(table, key, value, sql);
        log.info("sql{}", sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @DS(value = "thinker")
    @PostMapping("/thinker")
    @ResponseBody
    public List<Map<String, Object>> thinker(String table, String[] key, String[] value,String sql) {
        sql = sqlcheck(table, key, value, sql);
        log.info("sql{}", sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @DS(value = "groot")
    @PostMapping("/groot")
    @ResponseBody
    public List<Map<String, Object>> groot(String table, String[] key, String[] value,String sql) {
        sql = sqlcheck(table, key, value, sql);
        log.info("sql{}", sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @DS(value = "market")
    @PostMapping("/market")
    @ResponseBody
    public List<Map<String, Object>> market(String table, String[] key, String[] value,String sql) {
        sql = sqlcheck(table, key, value, sql);
        log.info("sql{}", sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    @DS(value = "dragonfly")
    @PostMapping("/dragonfly")
    @ResponseBody
    public List<Map<String, Object>> dragonfly(String table, String[] key, String[] value,String sql) {
        sql = sqlcheck(table, key, value, sql);
        log.info("sql{}", sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }
}
