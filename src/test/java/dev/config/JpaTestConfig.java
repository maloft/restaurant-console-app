package dev.config;

import org.springframework.context.annotation.*;

@Configuration
@Import({JpaConfig.class, JdbcTestConfig.class})
public class JpaTestConfig {

}