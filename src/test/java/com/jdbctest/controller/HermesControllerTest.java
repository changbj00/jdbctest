package com.jdbctest.controller;

import com.jdbctest.mapper.HermesMapper;
import com.jdbctest.service.Hermes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class HermesControllerTest {
    @Autowired
    Hermes hermes;
    @Autowired
    HermesMapper hermesMapper;

    @Test
    void gethermes() {
        //hermes.selecthermes("uid","100048","hermes_id");
    }
}