package com.jdbctest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.hermes")
    public DataSource hermesDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.spore")
    public DataSource sporeDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.orion")
    public DataSource orionDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.engines")
    public DataSource enginesDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.sender")
    public DataSource senderDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.thinker")
    public DataSource thinkerDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.groot")
    public DataSource grootDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "sspring.datasource.dynamic.datasource.market")
    public DataSource marketDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.dynamic.datasource.dragonfly")
    public DataSource dragonflyDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource(DataSource hermesDataSource, DataSource sporeDataSource,
                                        DataSource orionDataSource, DataSource enginesDataSource,
                                        DataSource senderDataSource, DataSource thinkerDataSource,
                                        DataSource grootDataSource, DataSource marketDataSource,
                                        DataSource dragonflyDataSource) {
        HashMap dataSourceMap = new HashMap();
        dataSourceMap.put(DataSourceType.hermes.name(), hermesDataSource);
        dataSourceMap.put(DataSourceType.spore.name(), sporeDataSource);
        dataSourceMap.put(DataSourceType.orion.name(), orionDataSource);
        dataSourceMap.put(DataSourceType.engines.name(), enginesDataSource);
        dataSourceMap.put(DataSourceType.sender.name(), senderDataSource);
        dataSourceMap.put(DataSourceType.groot.name(), grootDataSource);
        dataSourceMap.put(DataSourceType.thinker.name(), thinkerDataSource);
        dataSourceMap.put(DataSourceType.market.name(), marketDataSource);
        dataSourceMap.put(DataSourceType.dragonfly.name(), dragonflyDataSource);
        return new DynamicDataSource(hermesDataSource, dataSourceMap);
    }
}
