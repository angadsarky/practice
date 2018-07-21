package com.del.dao;

import com.del.exception.BankingException;

public interface BankingDao {
	void depositAmount(double amount);

	double getAmount();

	void withdrawAmount(double amount1) throws BankingException;

	boolean authenticate(String login, String password);
}
