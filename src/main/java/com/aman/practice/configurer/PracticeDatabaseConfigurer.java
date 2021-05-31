package com.aman.practice.configurer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PracticeDatabaseConfigurer {

    @Value("${spring.datasource2.url}")
    private String dbUrl;

    @Value("${spring.datasource2.username}")
    private String dbUser;

    @Value("${spring.datasource2.password}")
    private String dbPass;

    // This will override the default datasource created in properties file
    // with properties starting with "spring.datasource....."
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(dbUrl);
        dataSourceBuilder.username(dbUser);
        dataSourceBuilder.password(dbPass);
        return dataSourceBuilder.build();
    }

}
