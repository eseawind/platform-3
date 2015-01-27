package com.lml.platform.core.config.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lml.platform.core.config.CoreContextConfig;

/**
 * 核心上下文配置测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CoreContextConfig.class })
public class CoreContextConfigTest {

	private final Logger logger = LoggerFactory.getLogger(CoreContextConfigTest.class);

	/**
	 * 测试环境,查看日记输出是否环境配置正常
	 *
	 * @throws Exception
	 */
	@Test
	public void testEnvironment() throws Exception {
		logger.debug("testEnvironment");
	}
}
