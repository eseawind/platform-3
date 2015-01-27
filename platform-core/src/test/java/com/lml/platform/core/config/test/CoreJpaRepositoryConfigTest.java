package com.lml.platform.core.config.test;

import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lml.platform.core.config.CoreContextConfig;
import com.lml.platform.core.model.dictionary.DictionaryGroup;
import com.lml.platform.core.repository.dictionary.DictionaryDataRepository;
import com.lml.platform.core.repository.dictionary.DictionaryGroupRepository;
import com.lml.platform.core.repository.dictionary.DictionaryTypeRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CoreContextConfig.class })
public class CoreJpaRepositoryConfigTest {

	private final Logger logger = LoggerFactory.getLogger(CoreContextConfigTest.class);

	@Autowired
	private DictionaryDataRepository dictionaryDataRepository;
	@Autowired
	private DictionaryGroupRepository dictionaryGroupRepository;
	@Autowired
	private DictionaryTypeRepository dictionaryTypeRepository;

	@Test
	public void testEnvironment() throws Exception {
		logger.debug("testEnvironment");
		logger.debug("dictionaryDataRepository {} ,{}", dictionaryDataRepository,dictionaryDataRepository.getClass());
		logger.debug("dictionaryGroupRepository {},{}", dictionaryGroupRepository,dictionaryGroupRepository.getClass());
		logger.debug("dictionaryTypeRepository {},{}", dictionaryTypeRepository,dictionaryTypeRepository.getClass());
	}

	@Test
	public void testSaveDictionaryGroup() {
		DictionaryGroup dictionaryGroup = new DictionaryGroup();
		dictionaryGroup.setName("测试字典分组的名称");
		dictionaryGroup.setRemark("测试字典分组的备注");
		dictionaryGroup.setSort(0);
		DictionaryGroup pDictionaryGroup = dictionaryGroupRepository.save(dictionaryGroup);
		logger.debug("pDictionaryGroup {}", pDictionaryGroup);
	}

	@Test
	public void testUpdateDictionaryGroup() {
		DictionaryGroup dictionaryGroup = dictionaryGroupRepository.findOne(1);
		dictionaryGroup.setName("我被修改了");
		dictionaryGroupRepository.save(dictionaryGroup);
	}

	@Test
	public void testFindByVisible() {
		List<DictionaryGroup> ds = dictionaryGroupRepository.findByVisible(false);
		logger.debug("ds {}", ds);
	}

	@Test
	public void findByCreatedDateBetween() throws Exception {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

		List<DictionaryGroup> ds = dictionaryGroupRepository.findByCreatedDateBetween(simpleDateFormat.parse("2015-01-20"), simpleDateFormat.parse("2015-01-27"));

		logger.debug("ds {}", ds);

	}

}
