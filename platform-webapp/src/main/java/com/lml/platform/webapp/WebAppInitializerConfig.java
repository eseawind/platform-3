package com.lml.platform.webapp;

import static com.lml.platform.util.resources.ConfigurationResources.*;

import javax.servlet.Filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	private final Logger logger = LoggerFactory.getLogger(WebAppInitializerConfig.class);

	public WebAppInitializerConfig() {
		logger.debug("WebAppInitializerConfig");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {};
	}

	@Override
	protected Filter[] getServletFilters() {

		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding(ENCODING_UTF_8);
		characterEncodingFilter.setForceEncoding(true);

		return new Filter[] { characterEncodingFilter };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
