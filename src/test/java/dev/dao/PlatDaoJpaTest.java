package dev.dao;

import org.springframework.test.context.*;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import dev.config.JpaTestConfig;

@SpringJUnitConfig(classes = {PlatDaoJpa.class, JpaTestConfig.class})
@ActiveProfiles("jpa")
public class PlatDaoJpaTest extends IPlatDaoIntegrationTest{


}