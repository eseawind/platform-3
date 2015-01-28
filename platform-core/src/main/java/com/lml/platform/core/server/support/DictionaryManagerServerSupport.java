package com.lml.platform.core.server.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lml.platform.core.repository.dictionary.DictionaryDataRepository;
import com.lml.platform.core.repository.dictionary.DictionaryGroupRepository;
import com.lml.platform.core.repository.dictionary.DictionaryTypeRepository;
import com.lml.platform.core.server.DictionaryManagerServer;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DictionaryManagerServerSupport implements DictionaryManagerServer {

	@Autowired
	private DictionaryDataRepository dictionaryDataRepository;
	@Autowired
	private DictionaryGroupRepository dictionaryGroupRepository;
	@Autowired
	private DictionaryTypeRepository dictionaryTypeRepository;

}
