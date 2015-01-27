package com.lml.platform.core.model.support;

import java.io.Serializable;

import org.springframework.data.domain.Persistable;

/***
 * 数据操作支持,目前简单实现支持是否可见(非物理删除),是否可修改数据,是否可物理删除. 后面可能会加入数据权限控制以及过滤
 */
public interface JpaDataOperateSupport<ID extends Serializable> extends Persistable<ID> {

	/***
	 * 获取是否删除(可见,即就是非物理删除) ,默认是false
	 * 
	 * @return 是否删除(可见,即就是非物理删除)
	 */
	public Boolean getVisible();

	/***
	 * 设置是否删除(可见,即就是非物理删除)
	 * 
	 * @param visible
	 *            是否删除(可见,即就是非物理删除)
	 * @return 是否删除(可见,即就是非物理删除)
	 */
	public void setVisible(Boolean visible);

	/***
	 * 获取是否可以修改,默认是true
	 * 
	 * @return 是否可以修改
	 */
	public Boolean getChangeable();

	/***
	 * 设置是否可以修改
	 * 
	 * @param changeable
	 *            是否可以修改
	 */
	public void setChangeable(Boolean changeable);

	/***
	 * 获取是否可以物理删除,默认是不建议进行物理删除,值为false
	 * 
	 * @return 是否可以物理删除
	 */
	public Boolean getDeletable();

	/***
	 * 设置是否可以物理删除
	 * 
	 * @param deletable
	 *            是否可以物理删除
	 */
	public void setDeletable(Boolean deletable);

}
