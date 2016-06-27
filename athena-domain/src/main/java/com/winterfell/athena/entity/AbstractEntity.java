package com.winterfell.athena.entity;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

public class AbstractEntity extends AbstractPersistable<Long> {
	private static final long serialVersionUID = -2530209979695905579L;
	@Version
	private Long version;// 版本
	@CreatedBy
	private Long createdBy; // 创建人
	@CreatedDate
	@Temporal(TemporalType.DATE)
	private Date createdDate;// 创建时间
	@LastModifiedBy
	private Long lastModifiedBy;// 最后修改人
	@LastModifiedDate
	@Temporal(TemporalType.DATE)
	private Date lastModifiedDate;// 最后修改时间

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}