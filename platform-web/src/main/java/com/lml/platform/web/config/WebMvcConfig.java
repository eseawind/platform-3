package com.lml.platform.web.config;

import static com.lml.platform.util.resources.ConfigurationResources.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan("org.platform.web.controller")
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	private final Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);

	public WebMvcConfig() {
		logger.debug("WebMvcConfig");
	}

	@Bean
	public ThymeleafViewResolver thymeleafViewResolver() {

		ServletContextTemplateResolver servletContextTemplateResolver = new ServletContextTemplateResolver();
		servletContextTemplateResolver.setPrefix(THYMELEAF_TEMPLATE_PREFIX);// 设置前缀
		servletContextTemplateResolver.setSuffix(THYMELEAF_TEMPLATE_SUFFIX);// 设置后缀
		servletContextTemplateResolver.setTemplateMode(THYMELEAF_TEMPLATE_MODE);// 设置模型
		servletContextTemplateResolver.setCacheable(false);// 设置是否使用缓存

		SpringTemplateEngine springTemplateEngine = new SpringTemplateEngine();
		springTemplateEngine.addTemplateResolver(servletContextTemplateResolver);

		ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
		thymeleafViewResolver.setTemplateEngine(springTemplateEngine);// 设置模板引擎
		thymeleafViewResolver.setCharacterEncoding(ENCODING_UTF_8);// 设置编码格式
		thymeleafViewResolver.setContentType(CONTENT_TYPE);// 设置内容类型

		return thymeleafViewResolver;
	}

}
