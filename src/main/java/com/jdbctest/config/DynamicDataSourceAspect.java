package com.jdbctest.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Order(1)
@Aspect
public class DynamicDataSourceAspect {
    @Pointcut("@annotation(com.jdbctest.config.DataSource)")
    public void dsPointCut(){

    }

    @Around("dsPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature= (MethodSignature) point.getSignature();
        Method method=signature.getMethod();
        DataSource dataSource=method.getAnnotation(DataSource.class);
        if (dataSource!=null){
            DynamicDataSourceContextHolder.setDataSource(dataSource.value().name());
        }
        try {
            return point.proceed();
        }finally {
            DynamicDataSourceContextHolder.clearDataSource();
        }
    }
}
