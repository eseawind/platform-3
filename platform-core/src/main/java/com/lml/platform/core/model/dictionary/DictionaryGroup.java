package com.lml.platform.core.model.dictionary;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.lml.platform.core.model.support.AbstractJpaAuditSupport;

/**
 * 字典组
 */
@Entity
@Table(name = "CORE_DICTIONARY_GROUP")
public class DictionaryGroup extends AbstractJpaAuditSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * 字典组名称
	 */
	@Column(name = "_NAME", unique = false, nullable = false, length = 64)
	private String name;

	/**
	 * 字典组备注
	 */
	@Column(name = "_REMARK", length = 1024)
	private String remark;

	/**
	 * 字典组的排序
	 */
	@Column(name = "_SORT", unique = false, nullable = true)
	private Integer sort;

	/**
	 * 字典组所包含的全部字典数据
	 * <p>
	 * 注解级联说明:级联操作刷新,分离,合并,由于是由对方控制的,删除不能存在级联,以及在保存时一样,否则出错,无法是最优的配置
	 * </p>
	 */
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.PERSIST }, fetch = FetchType.LAZY, targetEntity = DictionaryData.class, mappedBy = "group")
	private List<DictionaryData> dictionaryDataList;

	public DictionaryGroup() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public List<DictionaryData> getDictionaryDataList() {
		return dictionaryDataList;
	}

	public void setDictionaryDataList(List<DictionaryData> dictionaryDataList) {
		this.dictionaryDataList = dictionaryDataList;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("name", name).append("remark", remark).append("sort", sort).toString();
	}

}
