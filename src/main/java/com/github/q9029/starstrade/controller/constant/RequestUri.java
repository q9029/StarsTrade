package com.github.q9029.starstrade.controller.constant;

public class RequestUri {

	private RequestUri() {}

	public static final String INDEX = "/";
	public static final String SIGNIN = "/signin";
	public static final String SIGNOUT = "/signout";
	public static final String CALLBACK = "/callback";
	public static final String CARDLIST = "/cardlist";
	public static final String CARD = "/card";
	public static final String SEARCH = "/search";
	public static final String PRIVACYPOLICY = "/privacypolicy";
	public static final String TERMS = "/terms";
	public static final String E404 = "/E404";
	public static final String E503 = "/E503";

	public class Job {

		public static final String HEALTHCHECK = "/job/healthcheck";
		public static final String CLEAN_ACCOUNTS = "/job/clean/accounts";

		public class Reload {
			public static final String SYSTEM_SETTINGS = "/job/reload/system_settings";
			public static final String VOLUMES = "/job/reload/volumes";
			public static final String BRANDS = "/job/reload/brands";
			public static final String RARE_TYPES = "/job/reload/rare_types";
		}
	}
}
