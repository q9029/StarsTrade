package com.github.q9029.aikatsustars.repository;

import java.util.List;

import com.github.q9029.aikatsustars.repository.dto.SystemSettingDto;

public interface SystemSettingsDao {

	List<SystemSettingDto> loadAll();
}
