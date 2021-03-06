package com.github.q9029.starstrade.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.q9029.starstrade.controller.constant.RequestUri;
import com.github.q9029.starstrade.service.AccountsService;

@RestController
@RequestMapping(value = RequestUri.Job.CLEAN_ACCOUNTS)
public class JobCleanController {

	private static final Logger LOG = Logger.getLogger(JobCleanController.class);

	@Autowired
	private AccountsService accountsService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<String> doHead() {

		accountsService.verifyAll();

		HttpHeaders headers = new HttpHeaders();
		headers.add("Connection", "close");
		headers.add("Content-Length", "0");
		return new ResponseEntity<>(null, headers, HttpStatus.OK);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception e) {
		LOG.error(e.getMessage(), e);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Connection", "close");
		headers.add("Content-Length", "0");
		return new ResponseEntity<>(null, headers, HttpStatus.SERVICE_UNAVAILABLE);
	}
}
