package com.titec.apportion.configuration;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@EnableWebFlux
@EnableR2dbcRepositories(basePackages = "com.titec.apportion.repository")
@ConfigurationPropertiesScan (basePackages = "com.titec.apportion")
@EntityScan(basePackages = "com.titec.apportion.common.model")
public class ApplicationConfiguration {

     @Bean
     public ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
         ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
         initializer.setConnectionFactory(connectionFactory);
          ResourceDatabasePopulator populator = new ResourceDatabasePopulator(new ClassPathResource("apportion.sql"));
          initializer.setDatabasePopulator(populator);
         return initializer;
     }
}

