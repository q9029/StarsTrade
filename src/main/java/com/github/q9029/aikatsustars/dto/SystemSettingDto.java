package com.github.q9029.aikatsustars.dto;

import java.sql.Timestamp;

public class SystemSettingDto {

	private Long id;
	private String key;
	private String value;
	private Timestamp createdAt;
	private Timestamp modifiedAt;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
}
