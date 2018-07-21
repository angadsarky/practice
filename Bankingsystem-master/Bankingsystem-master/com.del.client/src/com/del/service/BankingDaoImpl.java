package com.del.service;

import com.del.dao.BankingDao;
import com.del.exception.BankingException;
import com.del.util.MESSAGE;

public class BankingDaoImpl implements BankingDao {
	private static final double minBalance = 500;
	private double balance;
	private String login="Deloitte";
	private String password="Del123";

	@Override
	public void depositAmount(double amount) {
		balance=balance+amount;
		
	}

	@Override
	public double getAmount() {
		
		return balance;
	}

	@Override
	public void withdrawAmount(double amount1) throws BankingException {
		double bal=balance-amount1;
		if(bal<minBalance) {
			throw new BankingException(MESSAGE.LOW_BALANCE);
		}
		else balance=bal;
		
	}

	@Override
	public boolean authenticate(String login, String password) {
	   if(this.login.equals(login) && this.password.equals(password))
		   return true;
	   else return false;
		
	}
	

}
