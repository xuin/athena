package com.winterfell.athena.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 实体：商品分类
 * 
 * @author J
 */
@Entity
public class ProductClass extends AbstractEntity {
	private static final long serialVersionUID = 4595905366281346458L;
	/** 分类名称 */
	private String name;
	/** 权重 */
	private Integer weight;
	/** 上级分类 */
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private ProductClass parent;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductClass getParent() {
		return parent;
	}

	public void setParent(ProductClass parent) {
		this.parent = parent;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

}
