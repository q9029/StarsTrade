package com.github.q9029.aikatsustars.repository;

import java.util.List;

import com.github.q9029.aikatsustars.dto.Account;

public interface AccountsDao {

    List<Account> findAll();

    Account findById();
}