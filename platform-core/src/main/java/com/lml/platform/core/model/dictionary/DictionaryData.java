package com.lml.platform.core.model.dictionary;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.lml.platform.core.model.support.AbstractJpaAuditSupport;

/**
 * 字典数据
 */
@Entity
@Table(name = "CORE_DICTIONARY_DATA")
public class DictionaryData extends AbstractJpaAuditSupport {

 
	private static final long serialVersionUID = 1L;

	/**
     * 字典数据名称
     */
    @Column(name = "_NAME", unique = false, nullable = false, length = 64)
    private String name;

    /**
     * 字典数据值
     */
    @Column(name = "_VALUE", length = 1024)
    private String value;

    /**
     * 字典数据备注
     */
    @Column(name = "_REMARK", length = 1024)
    private String remark;

    /**
     * 字典数据的编码
     */
    @Column(name = "_CODE", unique = false, nullable = true, length = 64)
    private String code;

    /**
     * 字典数据的其它数据
     */
    @Column(name = "_OTHER", length = 1024)
    private String other;

    /**
     * 字典数据排序
     */
    @Column(name = "_SORT", unique = false, nullable = true)
    private Integer sort;

    /**
     * 字典数据所属的字典类型
     */
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE}, fetch = FetchType.LAZY, targetEntity = DictionaryType.class)
    @JoinColumn(name = "_DICTIONARY_TYPE_ID", referencedColumnName = "_ID", nullable = false)
    private DictionaryType type;

    /**
     * 字典数据所属的字典组
     */
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE}, fetch = FetchType.LAZY, targetEntity = DictionaryGroup.class)
    @JoinColumn(name = "_DICTIONARY_GROUP_ID", referencedColumnName = "_ID", nullable = false)
    private DictionaryGroup group;

    /**
     * 字典数据所属的父级的字典数据
     */
    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.MERGE}, fetch = FetchType.LAZY, targetEntity = DictionaryData.class)
    @JoinColumn(name = "_DICTIONARY_DATA_PARENT_ID", referencedColumnName = "_ID", nullable = false)
    private DictionaryData parent;

    /**
     * 字典数据所包含的子级字典数据
     */
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY, targetEntity = DictionaryData.class, mappedBy = "parent")
    private List<DictionaryData> children;

    public DictionaryData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public DictionaryType getType() {
        return type;
    }

    public void setType(DictionaryType type) {
        this.type = type;
    }

    public DictionaryGroup getGroup() {
        return group;
    }

    public void setGroup(DictionaryGroup group) {
        this.group = group;
    }

    public DictionaryData getParent() {
        return parent;
    }

    public void setParent(DictionaryData parent) {
        this.parent = parent;
    }

    public List<DictionaryData> getChildren() {
        return children;
    }

    public void setChildren(List<DictionaryData> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("name", name)
                .append("value", value)
                .append("remark", remark)
                .append("code", code)
                .append("other", other)
                .append("sort", sort)
                .append("type", type)
                .append("group", group)
                .toString();
    }

}