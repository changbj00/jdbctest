package com.jdbctest.config;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DynamicDataSourceContextHolder {
    public static final ThreadLocal<String> ContextHolder=new ThreadLocal<>();

    public static void setDataSource(String dbType){
        log.info("切换到{}数据源", dbType);
        ContextHolder.set(dbType);
    }

    public static String getDataSource(){
        return ContextHolder.get();
    }

    public static void clearDataSource(){
        ContextHolder.remove();
    }
}
