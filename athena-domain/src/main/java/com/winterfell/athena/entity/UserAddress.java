package com.winterfell.athena.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserAddress extends AbstractEntity {
	private static final long serialVersionUID = 7286348269653207112L;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "distribution_address_id")
	private DistributionAddress distributionAddress;
	private String fullAddress;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DistributionAddress getDistributionAddress() {
		return distributionAddress;
	}

	public void setDistributionAddress(DistributionAddress distributionAddress) {
		this.distributionAddress = distributionAddress;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

}
