package com.github.q9029.aikatsustars.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;

import com.github.q9029.aikatsustars.service.BrandsService;
import com.github.q9029.aikatsustars.service.SystemSettingsService;
import com.github.q9029.aikatsustars.service.VolumesService;
import com.github.q9029.aikatsustars.service.cache.SystemSettingsCachedData;
import com.github.q9029.aikatsustars.util.ApplicationContextUtil;

public class SystemStartupServlet extends HttpServlet {

	private static final Logger LOG = Logger.getLogger(SystemSettingsCachedData.class);

	@Override
	public void init() throws ServletException {
		try {
			SystemSettingsService systemSettingsService = ApplicationContextUtil.getComponent(SystemSettingsService.class);
			systemSettingsService.cacheRepositoryData();

			BrandsService brandsService = ApplicationContextUtil.getComponent(BrandsService.class);
			brandsService.cacheRepositoryData();

			VolumesService volumesService = ApplicationContextUtil.getComponent(VolumesService.class);
			volumesService.cacheRepositoryData();

		} catch (Exception e) {
			LOG.error("システムの起動に失敗しました。", e);
			throw e;
		}
	}
}