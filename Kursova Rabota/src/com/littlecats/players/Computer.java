package com.littlecats.players;

import java.util.Random;

import com.littlecats.invest.Invest;
import com.littlecats.invest.InvestType;
import com.littlecats.traps.*;

public class Computer extends GamePlayer {
	public Computer() {
		super();
	}
	
	@Override
	public Trap chooseTrap() {
		// decide trap
		Random rand = new Random();
		if (rand.nextInt(10) >=7 || money < 50) {
			return null;
		}
		
		//choose trap
		int trapType;
		do {
			trapType = rand.nextInt(5);
		} while (Trap.getMinInvest(TrapType.values()[trapType]) > money);
		money -= Trap.getMinInvest(TrapType.values()[trapType]);
		return new Trap(TrapType.values()[trapType], this);
	}
	
	@Override
	public void chooseInvest() {
		super.chooseInvest();
		if (money < 50) {
			return;
		}
		
		int investType;
		Random rand = new Random();
		Invest inv;
		do {
			investType = rand.nextInt(6);
			inv = new Invest(InvestType.values()[investType]);
		} while (inv.getMinInvestment() > money);
		
		investments.add(inv);
	}
}
