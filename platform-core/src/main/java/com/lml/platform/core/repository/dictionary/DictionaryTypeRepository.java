package com.lml.platform.core.repository.dictionary;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.lml.platform.core.model.dictionary.DictionaryType;
import com.lml.platform.core.repository.support.JpaAuditRepository;

public interface DictionaryTypeRepository extends JpaAuditRepository<DictionaryType> {


    List<DictionaryType> findByName(String name);

    List<DictionaryType> findByName(String name, Sort sort);

    Page<DictionaryType> findByName(String name, Pageable pageable);


    List<DictionaryType> findByNameLike(String name);

    List<DictionaryType> findByNameLike(String name, Sort sort);

    Page<DictionaryType> findByNameLike(String name, Pageable pageable);


    List<DictionaryType> findByNameNotLike(String name);

    List<DictionaryType> findByNameNotLike(String name, Sort sort);

    Page<DictionaryType> findByNameNotLike(String name, Pageable pageable);


    List<DictionaryType> findByNameStartingWith(String name);

    List<DictionaryType> findByNameStartingWith(String name, Sort sort);

    Page<DictionaryType> findByNameStartingWith(String name, Pageable pageable);


    List<DictionaryType> findByNameEndingWith(String name);

    List<DictionaryType> findByNameEndingWith(String name, Sort sort);

    Page<DictionaryType> findByNameEndingWith(String name, Pageable pageable);


    List<DictionaryType> findByNameNot(String name);

    List<DictionaryType> findByNameNot(String name, Sort sort);

    Page<DictionaryType> findByNameNot(String name, Pageable pageable);


    List<DictionaryType> findByRemarkContaining(String remark);

    List<DictionaryType> findByRemarkContaining(String remark, Sort sort);

    Page<DictionaryType> findByRemarkContaining(String remark, Pageable pageable);


}
