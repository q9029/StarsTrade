package com.github.q9029.starstrade.repository.dto;

import java.sql.Timestamp;

public class VolumeCardDto {

	private Integer id;
	private Integer volumeId;
	private Integer cardId;
	private Integer displayOrder;
	private Boolean valid;
	private Timestamp createdAt;
	private Timestamp modifiedAt;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVolumeId() {
		return volumeId;
	}
	public void setVolumeId(Integer volumeId) {
		this.volumeId = volumeId;
	}
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Integer getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
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
