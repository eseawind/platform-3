package com.lml.platform.core.repository.dictionary;

import com.lml.platform.core.model.dictionary.DictionaryData;
import com.lml.platform.core.model.dictionary.DictionaryGroup;
import com.lml.platform.core.model.dictionary.DictionaryType;
import com.lml.platform.core.repository.support.JpaAuditRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface DictionaryDataRepository extends JpaAuditRepository<DictionaryData> {


    List<DictionaryData> findByName(String name);

    List<DictionaryData> findByName(String name, Sort sort);

    Page<DictionaryData> findByName(String name, Pageable pageable);


    List<DictionaryData> findByNameLike(String name);

    List<DictionaryData> findByNameLike(String name, Sort sort);

    Page<DictionaryData> findByNameLike(String name, Pageable pageable);


    List<DictionaryData> findByNameNotLike(String name);

    List<DictionaryData> findByNameNotLike(String name, Sort sort);

    Page<DictionaryData> findByNameNotLike(String name, Pageable pageable);


    List<DictionaryData> findByNameStartingWith(String name);

    List<DictionaryData> findByNameStartingWith(String name, Sort sort);

    Page<DictionaryData> findByNameStartingWith(String name, Pageable pageable);


    List<DictionaryData> findByNameEndingWith(String name);

    List<DictionaryData> findByNameEndingWith(String name, Sort sort);

    Page<DictionaryData> findByNameEndingWith(String name, Pageable pageable);


    List<DictionaryData> findByNameNot(String name);

    List<DictionaryData> findByNameNot(String name, Sort sort);

    Page<DictionaryData> findByNameNot(String name, Pageable pageable);


    List<DictionaryData> findByRemarkContaining(String remark);

    List<DictionaryData> findByRemarkContaining(String remark, Sort sort);

    Page<DictionaryData> findByRemarkContaining(String remark, Pageable pageable);


    List<DictionaryData> findByValue(String value);

    List<DictionaryData> findByValue(String value, Sort sort);

    Page<DictionaryData> findByValue(String value, Pageable pageable);


    List<DictionaryData> findByValueLike(String value);

    List<DictionaryData> findByValueLike(String value, Sort sort);

    Page<DictionaryData> findByValueLike(String value, Pageable pageable);


    List<DictionaryData> findByValueNotLike(String value);

    List<DictionaryData> findByValueNotLike(String value, Sort sort);

    Page<DictionaryData> findByValueNotLike(String value, Pageable pageable);


    List<DictionaryData> findByValueStartingWith(String value);

    List<DictionaryData> findByValueStartingWith(String value, Sort sort);

    Page<DictionaryData> findByValueStartingWith(String value, Pageable pageable);


    List<DictionaryData> findByValueEndingWith(String value);

    List<DictionaryData> findByValueEndingWith(String value, Sort sort);

    Page<DictionaryData> findByValueEndingWith(String value, Pageable pageable);


    List<DictionaryData> findByValueNot(String value);

    List<DictionaryData> findByValueNot(String value, Sort sort);

    Page<DictionaryData> findByValueNot(String value, Pageable pageable);


    //***

    List<DictionaryData> findByCode(String code);

    List<DictionaryData> findByCode(String code, Sort sort);

    Page<DictionaryData> findByCode(String code, Pageable pageable);


    List<DictionaryData> findByCodeLike(String code);

    List<DictionaryData> findByCodeLike(String code, Sort sort);

    Page<DictionaryData> findByCodeLike(String code, Pageable pageable);


    List<DictionaryData> findByCodeNotLike(String code);

    List<DictionaryData> findByCodeNotLike(String code, Sort sort);

    Page<DictionaryData> findByCodeNotLike(String code, Pageable pageable);


    List<DictionaryData> findByCodeStartingWith(String code);

    List<DictionaryData> findByCodeStartingWith(String code, Sort sort);

    Page<DictionaryData> findByCodeStartingWith(String code, Pageable pageable);


    List<DictionaryData> findByCodeEndingWith(String code);

    List<DictionaryData> findByCodeEndingWith(String code, Sort sort);

    Page<DictionaryData> findByCodeEndingWith(String code, Pageable pageable);


    List<DictionaryData> findByCodeNot(String code);

    List<DictionaryData> findByCodeNot(String code, Sort sort);

    Page<DictionaryData> findByCodeNot(String code, Pageable pageable);


    List<DictionaryData> findByType(DictionaryType type);

    List<DictionaryData> findByType(DictionaryType type, Sort sort);

    Page<DictionaryData> findByType(DictionaryType type, Pageable pageable);


    List<DictionaryData> findByGroup(DictionaryGroup group);

    List<DictionaryData> findByGroup(DictionaryGroup group, Sort sort);

    Page<DictionaryData> findByGroup(DictionaryGroup group, Pageable pageable);


    List<DictionaryData> findByParent(DictionaryData parent);

    List<DictionaryData> findByParent(DictionaryData parent, Sort sort);

    Page<DictionaryData> findByParent(DictionaryData parent, Pageable pageable);


    List<DictionaryData> findByTypeAndGroup(DictionaryType type, DictionaryGroup group);

    List<DictionaryData> findByTypeAndGroup(DictionaryType type, DictionaryGroup group, Sort sort);

    Page<DictionaryData> findByTypeAndGroup(DictionaryType type, DictionaryGroup group, Pageable pageable);


    List<DictionaryData> findByTypeAndParent(DictionaryType type, DictionaryData parent);

    List<DictionaryData> findByTypeAndParent(DictionaryType type, DictionaryData parent, Sort sort);

    Page<DictionaryData> findByTypeAndParent(DictionaryType type, DictionaryData parent, Pageable pageable);


    List<DictionaryData> findByGroupAndParent(DictionaryGroup group, DictionaryData parent);

    List<DictionaryData> findByGroupAndParent(DictionaryGroup group, DictionaryData parent, Sort sort);

    Page<DictionaryData> findByGroupAndParent(DictionaryGroup group, DictionaryData parent, Pageable pageable);


    List<DictionaryData> findByTypeAndGroupAndParent(DictionaryType type, DictionaryGroup group, DictionaryData parent);

    List<DictionaryData> findByTypeAndGroupAndParent(DictionaryType type, DictionaryGroup group, DictionaryData parent, Sort sort);

    Page<DictionaryData> findByTypeAndGroupAndParent(DictionaryType type, DictionaryGroup group, DictionaryData parent, Pageable pageable);


}
