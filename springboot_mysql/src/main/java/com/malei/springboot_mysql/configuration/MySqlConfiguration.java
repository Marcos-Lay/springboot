package com.malei.springboot_mysql.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
public class MySqlConfiguration {

	@Bean("mysqlDataSource")
	public BasicDataSource configMysqlDataSource(@Value("${mysql.datasource.driverClassName}") String driverClassName,
			@Value("${mysql.datasource.url}") String url,
			@Value("${mysql.datasource.username}") String username,
			@Value("${mysql.datasource.password}") String password,
			@Value("${mysql.datasource.initialSize:1}") int initialSize,
			@Value("${mysql.datasource.maxTotal:1}") int maxTotal,
			@Value("${mysql.datasource.maxIdle:1}") int maxIdle,
			@Value("${mysql.datasource.minIdle:0}") int minIdle,
			@Value("${mysql.datasource.removeAbandonedOnBorrow:true}") boolean removeAbandonedOnBorrow,
			@Value("${mysql.datasource.removeAbandonedOnMaintenance:true}") boolean removeAbandonedOnMaintenance) {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(driverClassName);
		source.setUrl(url);
		source.setUsername(username);
		source.setPassword(password);
		source.setInitialSize(initialSize);
		source.setMaxTotal(maxTotal);
		source.setMaxIdle(maxIdle);
		source.setMinIdle(minIdle);
		return source;
	}
	
	@Bean("sqlSessionFactory")
	public SqlSessionFactoryBean configSqlSessionFactory(DataSource dataSource) {
		SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
		ssfb.setDataSource(dataSource);
		ssfb.setTypeAliasesPackage("com.malei.springboot_mysql.entity");
		ssfb.setConfigLocation(new ClassPathResource("mybatis/sqlMapConfig.xml"));
		return ssfb;
	}
	
	@Bean("sqlSessionTemplate")
	public SqlSessionTemplate configSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
}
