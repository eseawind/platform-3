package com.lml.platform.core.config;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 数据源配置
 */
@Configuration
public class CoreDataSourceConfig {

	private static final Logger logger = LoggerFactory.getLogger(CoreDataSourceConfig.class);

	private final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	private final String USER_NAME = "root";
	private final String PASSWORD = "";
	private final String URL = "jdbc:mysql://localhost/platform?useUnicode=true&characterEncoding=UTF-8";

	public CoreDataSourceConfig() {
		logger.debug("CoreMySQLConfig");
	}

	/**
	 * 数据源
	 */
	@Bean(initMethod = "init", destroyMethod = "close")
	public DataSource druidDataSource() {
		final DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName(DRIVER_CLASS_NAME);
		ds.setUsername(USER_NAME);
		ds.setPassword(PASSWORD);
		ds.setUrl(URL);
		ds.setInitialSize(5);
		ds.setMinIdle(1);
		ds.setMaxActive(10);
		ds.setTestOnBorrow(false);
		ds.setTestOnReturn(false);
		ds.setTestWhileIdle(false);
		return ds;
	}

}
