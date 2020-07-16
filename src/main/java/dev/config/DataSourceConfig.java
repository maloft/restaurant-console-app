package dev.config;

import javax.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.*;

@Configuration
public class DataSourceConfig {
	
	@Bean
	public DataSource dataSource(
			
			@Value("${bdd.driver}") String driver,
			@Value("${bdd.user}") String utilisateur,
			@Value("${bdd.pass}") String motDePasse,
			@Value("${bdd.url}") String url
	) {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driver);
		
		dataSource.setUrl(url);
		dataSource.setUsername(utilisateur);
		dataSource.setPassword(motDePasse);
		
		return dataSource;
	}
}
