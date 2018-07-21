package com.del.service;

import com.del.dao.BankingDao;
import com.del.exception.BankingException;
import com.del.util.MESSAGE;

public class BankingServiceImpl implements BankingService {
	private BankingDao bDao;
	
	public BankingServiceImpl() {
		bDao= new BankingDaoImpl();
	}
	@Override
	public void depositAmount(double amount) throws BankingException {
		if (amount<0) {
			throw new BankingException(MESSAGE.NEGATIVE_VALUE);
		}
		bDao.depositAmount(amount);
		
	}
	@Override
	public double getbalance() {
		double balance=0;
		balance=bDao.getAmount();
		return balance;
	}
	@Override
	public void withdrawAmount(double amount1) throws BankingException {
		bDao.withdrawAmount(amount1);
		
	}
	@Override
	public boolean authenticate(String login, String password) {
		
		return bDao.authenticate(login,password);
	}

}
