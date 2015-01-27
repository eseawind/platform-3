/**
 *
 */
package com.lml.platform.core.repository.dictionary;

import com.lml.platform.core.model.dictionary.DictionaryGroup;
import com.lml.platform.core.repository.support.JpaAuditRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface DictionaryGroupRepository extends JpaAuditRepository<DictionaryGroup> {

    List<DictionaryGroup> findByName(String name);

    List<DictionaryGroup> findByName(String name, Sort sort);

    Page<DictionaryGroup> findByName(String name, Pageable pageable);


    List<DictionaryGroup> findByNameLike(String name);

    List<DictionaryGroup> findByNameLike(String name, Sort sort);

    Page<DictionaryGroup> findByNameLike(String name, Pageable pageable);


    List<DictionaryGroup> findByNameNotLike(String name);

    List<DictionaryGroup> findByNameNotLike(String name, Sort sort);

    Page<DictionaryGroup> findByNameNotLike(String name, Pageable pageable);


    List<DictionaryGroup> findByNameStartingWith(String name);

    List<DictionaryGroup> findByNameStartingWith(String name, Sort sort);

    Page<DictionaryGroup> findByNameStartingWith(String name, Pageable pageable);


    List<DictionaryGroup> findByNameEndingWith(String name);

    List<DictionaryGroup> findByNameEndingWith(String name, Sort sort);

    Page<DictionaryGroup> findByNameEndingWith(String name, Pageable pageable);


    List<DictionaryGroup> findByNameNot(String name);

    List<DictionaryGroup> findByNameNot(String name, Sort sort);

    Page<DictionaryGroup> findByNameNot(String name, Pageable pageable);


    List<DictionaryGroup> findByRemarkContaining(String remark);

    List<DictionaryGroup> findByRemarkContaining(String remark, Sort sort);

    Page<DictionaryGroup> findByRemarkContaining(String remark, Pageable pageable);


}
