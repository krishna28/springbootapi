package com.demo.ea.model.base;

import java.util.Date;

public abstract class BaseEntity {
	
	private Date dateCreated;
	private Date dateUpdated;
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

}
