package com.lml.platform.core.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 核心上下文配置
 */
@Configuration
@Import({ CoreDataSourceConfig.class, CoreJpaRepositoryConfig.class })
@ComponentScan(basePackages = { "com.lml.platform.core.repository", "com.lml.platform.core.server" })
public class CoreContextConfig {
	
	private final Logger logger = LoggerFactory.getLogger(CoreContextConfig.class);

	public CoreContextConfig() {
		logger.debug("CoreContextConfig");
	}

}
