package com.jdbctest.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HermesMapper {
    List selecthermes(@Param("table") String table,@Param("key") String key, @Param("value") String value);
}
