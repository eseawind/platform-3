package com.lml.platform.core.repository.support;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import com.lml.platform.core.model.support.AbstractJpaAuditSupport;

@NoRepositoryBean
public interface JpaAuditRepository<T extends AbstractJpaAuditSupport> extends JpaRepository<T, Integer>, JpaSpecificationExecutor<T> {

    List<T> findByVisible(boolean visible);

    List<T> findByVisible(boolean visible, Sort sort);

    Page<T> findByVisible(boolean visible, Pageable pageable);


    List<T> findByChangeable(boolean changeable);

    List<T> findByChangeable(boolean changeable, Sort sort);

    Page<T> findByChangeable(boolean changeable, Pageable pageable);


    List<T> findByDeletable(boolean deletable);

    List<T> findByDeletable(boolean deletable, Sort sort);

    Page<T> findByDeletable(boolean deletable, Pageable pageable);


    List<T> findByCreatedDate(Date createdDate);

    List<T> findByCreatedDate(Date createdDate, Sort sort);

    Page<T> findByCreatedDate(Date createdDate, Pageable pageable);


    List<T> findByLastModifiedDate(Date lastModifiedDate);

    List<T> findByLastModifiedDate(Date lastModifiedDate, Sort sort);

    Page<T> findByLastModifiedDate(Date lastModifiedDate, Pageable pageable);


    List<T> findByCreatedDateBetween(Date startDate, Date endDate);

    List<T> findByCreatedDateBetween(Date startDate, Date endDate, Sort sort);

    Page<T> findByCreatedDateBetween(Date startDate, Date endDate, Pageable pageable);


    List<T> findByLastModifiedDateBetween(Date startDate, Date endDate);

    List<T> findByLastModifiedDateBetween(Date startDate, Date endDate, Sort sort);

    Page<T> findByLastModifiedDateBetween(Date startDate, Date endDate, Pageable pageable);


    List<T> findByVisibleAndChangeable(boolean visible, boolean changeable);

    List<T> findByVisibleAndChangeable(boolean visible, boolean changeable, Sort sort);

    Page<T> findByVisibleAndChangeable(boolean visible, boolean changeable, Pageable pageable);


    List<T> findByVisibleAndDeletable(boolean visible, boolean deletable);

    List<T> findByVisibleAndDeletable(boolean visible, boolean deletable, Sort sort);

    Page<T> findByVisibleAndDeletable(boolean visible, boolean deletable, Pageable pageable);


    List<T> findByChangeableAndDeletable(boolean changeable, boolean deletable);

    List<T> findByChangeableAndDeletable(boolean changeable, boolean deletable, Sort sort);

    Page<T> findByChangeableAndDeletable(boolean changeable, boolean deletable, Pageable pageable);


    List<T> findByVisibleAndChangeableAndDeletable(boolean visible, boolean changeable, boolean deletable);

    List<T> findByVisibleAndChangeableAndDeletable(boolean visible, boolean changeable, boolean deletable, Sort sort);

    Page<T> findByVisibleAndChangeableAndDeletable(boolean visible, boolean changeable, boolean deletable, Pageable pageable);


}
