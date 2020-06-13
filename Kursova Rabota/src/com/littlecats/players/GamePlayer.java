package com.littlecats.players;

import java.util.ArrayList;
import java.util.List;

import com.littlecats.chances.ChanceGenerator;
import com.littlecats.invest.*;
import com.littlecats.steal.Steal;
import com.littlecats.steal.StealType;
import com.littlecats.traps.*;

public abstract class GamePlayer {
	int onField;
	double money;
	List<Invest> investments = new ArrayList<Invest>();
	List<Trap> activeTraps = new ArrayList<Trap>();
	Steal steal;

	public void setMoney(double money) {
		this.money = money;
	}

	public List<Trap> getActiveTraps() {
		return activeTraps;
	}

	public GamePlayer() {
		super();
		this.onField = 0;
		this.money = 1000;
	}

	public int getOnField() {
		return onField;
	}

	public void setOnField(int onField) {
		this.onField = onField;
	}
	
	public void moveForward(int fieldsToMove) {
		onField = (onField + fieldsToMove) % 20;
	}
	
	public void addInvestment(Invest investment) {
		this.investments.add(investment);
	}
	
	public List<Invest> getInvestments() {
		return investments;
	}

	public void addActiveTrap(Trap trap) {
		activeTraps.add(trap);
	}
	
	public double getMoney() {
		return money;
	}

	public abstract Trap chooseTrap();
	
	public void chooseInvest() {
		if (steal != null && steal.getType() == StealType.HOSTAGE) {
			money += 100;
		}
	}
	
	public void partyHard() {
		money -= 50;
	}
	
	public void chance() {
		ChanceGenerator chanceGen = new ChanceGenerator();
		money += chanceGen.getChance().getChanceBenifit();
		
		if (this.steal != null && this.steal.getType() == StealType.TAKE_OVER_WORLD) {
			money += 100;
		}
	}
	
	public void steal() {
		if (steal != null && steal.getType() == StealType.BIG_BANK_ROBBERY) {
			money += 100;
		}
	}

	public Steal getSteal() {
		return steal;
	}

	public void setSteal(Steal steal) {
		this.steal = steal;
	}
	
	public void addMoney(double quantity) {
		this.money += quantity;
	}
	
	@Override
	public String toString() {
		return "Field: " + onField + ", money: " + money;
	}
}
