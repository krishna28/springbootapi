package com.demo.ea.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.demo.ea.constant.StatusEnum;
import com.demo.ea.model.base.BaseEntity;

@Document(collection="todo")
public class Todo extends BaseEntity {

	@Id
    private String id;
	
	private String description;
	
	private StatusEnum status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", description=" + description + ", status=" + status + "]";
	}
	
	
}
