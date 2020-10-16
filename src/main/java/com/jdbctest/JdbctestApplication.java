package com.jdbctest;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JdbctestApplication implements CommandLineRunner,ApplicationContextAware {

    public static void main(String[] args) {
        SpringApplication.run(JdbctestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
