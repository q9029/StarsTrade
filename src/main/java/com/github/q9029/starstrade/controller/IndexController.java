package com.github.q9029.starstrade.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.q9029.starstrade.controller.constant.RequestUri;
import com.github.q9029.starstrade.controller.constant.SessionKey;
import com.github.q9029.starstrade.controller.constant.View;
import com.github.q9029.starstrade.repository.dto.AccountDto;
import com.github.q9029.starstrade.service.TwitterService;

import twitter4j.TwitterException;

@Controller
@RequestMapping(value = RequestUri.INDEX)
public class IndexController {

	@Autowired
	private TwitterService twitterService;

	@RequestMapping(method = RequestMethod.GET)
	public String doGet(HttpSession session) {

		// セッションからアカウント情報の取得
		AccountDto account = (AccountDto) session.getAttribute(SessionKey.ACCOUNT);

		// NULLでない場合
		if (account != null) {
			// 有効性チェック
			try {
				twitterService.verify(account);

			} catch (TwitterException e) {
				// 有効でない場合、セッションを破棄
				session.invalidate();
			}
		}
		// index.jspを返却
		return View.INDEX;
	}
}
