package com.service;

import com.model.InterestCalculator;

public class BankingService {
	
	private InterestCalculator ic;

	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	public double service(double amount) {
		return ic.calculate(amount);
	}

}
