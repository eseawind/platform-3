package com.lml.platform.core.model.support;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * 抽象的映射支持
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractJpaAuditSupport extends AbstractJpaDataOperateSupport<Integer> {

	private static final long serialVersionUID = 1L;

	/***
	 * 创建数据的时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "_CREATED_DATE", unique = false, nullable = true)
	@CreatedDate
	private Date createdDate;

	/***
	 * 最好修改数据的时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "_LAST_MODIFIED_DATE", unique = false, nullable = true)
	@LastModifiedDate
	private Date lastModifiedDate;

	public AbstractJpaAuditSupport() {
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
