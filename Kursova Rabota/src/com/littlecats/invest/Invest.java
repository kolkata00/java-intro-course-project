package com.littlecats.invest;

import java.util.Random;

public class Invest {
	InvestType type;
	double investSum;

	public Invest(InvestType type) {
		super();
		this.type = type;
	}

	public double getInvestSum() {
		return investSum;
	}

	public void setInvestSum(double investSum) {
		this.investSum = investSum;
	}

	public InvestType getType() {
		return type;
	}
	
	public double getMinInvestment() {
		if (type == InvestType.EVEL_CO) {
			return 500;
		} else if (type == InvestType.BOMBS_AWAY) {
			return 400;
		} else if (type == InvestType.CLOCK_WORK_ORANGE) {
			return 300;
		} else if (type == InvestType.MARODERS_UNITED) {
			return 200;
		} else if (type == InvestType.FATCAT_INCORPORATED) {
			return 100;
		} else {
			return 50;
		}
	}
	
	public double getOutcome() {
		if (risk()) {
			return investSum * getCoefficient();
		} else {
			return - (investSum * getCoefficient());
		}
	}
	
	public double getCoefficient() {
		if (type == InvestType.EVEL_CO) {
			return 0.2;
		} else if (type == InvestType.BOMBS_AWAY) {
			return 0.5;
		} else if (type == InvestType.CLOCK_WORK_ORANGE) {
			return 1.5;
		} else if (type == InvestType.MARODERS_UNITED) {
			return 2;
		} else if (type == InvestType.FATCAT_INCORPORATED) { 
			return 2.5;
		} else {
			return 5.0;
		}
	}
	public boolean risk() {
		int min;
		int max;
		if (type == InvestType.EVEL_CO) {
			min = -5;
			max = 100;
		} else if (type == InvestType.BOMBS_AWAY) {
			min = -10;
			max = 50;
		} else if (type == InvestType.CLOCK_WORK_ORANGE) {
			min = -15;
			max = 35;
		} else if (type == InvestType.MARODERS_UNITED) {
			min = -18;
			max = 50;
		} else if (type == InvestType.FATCAT_INCORPORATED) {
			min = -25;
			max = 100;
		} else {
			min = -20;
			max = 10;
		}
		
		Random rand = new Random();
		
		int chance = rand.nextInt(max - min + 1);
		
		chance += min;
		
		if (chance > 0) {
			return true;
		} else {
			return false;
		}
	}
}
