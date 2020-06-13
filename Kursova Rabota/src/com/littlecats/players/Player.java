package com.littlecats.players;
import java.util.ArrayList;
import java.util.Scanner;

import com.littlecats.invest.*;
import com.littlecats.traps.*;

public class Player extends GamePlayer {
	ArrayList<Invest> invests = new ArrayList<Invest>();
	
	public Player() {
		super();
	}
	
	@Override
	public Trap chooseTrap() {
		System.out.println("Choose a trap to plant: ");
		int choise;
		for(int i = 0; i < TrapType.values().length; i++) {
			System.out.println((i+1) + ". " + TrapType.values()[i]);
		}
		do {
			choise = com.littlecats.scanner.Scan.scan.nextInt();
		}while (choise < 0 || choise > TrapType.values().length);
		
		if (choise == 0) {
			return null;
		}
		return new Trap(TrapType.values()[choise - 1], this);		
	}
	
	@Override
	public void chooseInvest() {
		super.chooseInvest();
		InvestEngine invEngine = new InvestEngine();
		invEngine.tryInvestment(this);
	}
}
