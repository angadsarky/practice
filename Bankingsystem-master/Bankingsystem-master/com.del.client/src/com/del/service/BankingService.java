package com.del.service;

import com.del.exception.BankingException;

public interface BankingService {

	void depositAmount(double amount) throws BankingException;

	double getbalance();

	void withdrawAmount(double amount1) throws BankingException;

	boolean authenticate(String login, String password);

}
