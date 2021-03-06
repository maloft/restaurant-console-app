package dev.dao;

import org.springframework.test.context.*;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import dev.config.JdbcTestConfig;

@SpringJUnitConfig(classes = {PlatDaoJdbc.class, JdbcTestConfig.class})
@ActiveProfiles("jdbc")
public class PlatDaoJdbcIntegrationTest extends IPlatDaoIntegrationTest {

}