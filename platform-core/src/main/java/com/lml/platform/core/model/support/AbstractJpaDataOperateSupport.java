package com.lml.platform.core.model.support;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/***
 * 抽象的数据操作支持实现.
 * 
 * @param <ID>
 *            主键ID
 */
@MappedSuperclass
public abstract class AbstractJpaDataOperateSupport<ID extends Serializable> implements JpaDataOperateSupport<Serializable> {

	private static final long serialVersionUID = 1L;

	/***
	 * 主键
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "_ID")
	private ID id;

	/***
	 * 是否删除(可见,即就是非物理删除) ,默认是false
	 */
	@Column(name = "_VISIBLE", unique = false, nullable = false, length = 1)
	private Boolean visible = false;

	/***
	 * 是否可以修改,默认是true
	 */
	@Column(name = "_CHANGEABLE", unique = false, nullable = false, length = 1)
	private Boolean changeable = true;

	/***
	 * 是否可以物理删除,默认是不建议进行物理删除,值为false
	 */
	@Column(name = "_DELETABLE", unique = false, nullable = false, length = 1)
	private Boolean deletable = false;

	public AbstractJpaDataOperateSupport() {
	}

	@Override
	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	@Override
	public Boolean getVisible() {
		return visible;
	}

	@Override
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	@Override
	public Boolean getChangeable() {
		return changeable;
	}

	@Override
	public void setChangeable(Boolean changeable) {
		this.changeable = changeable;
	}

	@Override
	public Boolean getDeletable() {
		return deletable;
	}

	@Override
	public void setDeletable(Boolean deletable) {
		this.deletable = deletable;
	}

	@Override
	public boolean isNew() {
		return null == getId();
	}

}
