package com.programacion.config;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

import javax.sql.DataSource;

@ApplicationScoped
public class DatabaseConfig {

    @Produces
    @ApplicationScoped
    public DataSource dataSource(){
        HikariDataSource ds = new HikariDataSource();

        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/distribuida");
        ds.setUsername("root");
        ds.setPassword("Pancho92");


        /* esto para cuando usamos elephant

        ds.setMinimumIdle(1);
        ds.setMaximumPoolSize(5);
        */

        return ds;
    }
}
