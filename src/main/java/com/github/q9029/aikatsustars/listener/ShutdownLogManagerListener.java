package com.github.q9029.aikatsustars.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.LogManager;

public class ShutdownLogManagerListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		LogManager.shutdown();
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// do nothing.
	}
}