package com.example.UserApi.configuration;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.datasource.impl.OracleDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Objects;


@Configuration
@ConfigurationProperties("oracle")
@Data
@Slf4j
public class DBConfiguration {
    private String url;
    private String username;
    private String password;
    private String datasource;

    @Bean
    public DataSource dataSource() throws SQLException{
        log.info("=============== Initializing database ==============");
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setURL(getUrl());
        dataSource.setUser(getUsername());
        dataSource.setPassword(getPassword());
        dataSource.setImplicitCachingEnabled(true);
        if (Objects.isNull(dataSource.getConnection())){
            log.info("============== Unable to connect database ================");
        }
            log.info("==============DB Connection Established======");
        return dataSource;
    }
}
