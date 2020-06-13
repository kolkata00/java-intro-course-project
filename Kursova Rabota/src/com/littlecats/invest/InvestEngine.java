package com.littlecats.invest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.littlecats.players.Player;

public class InvestEngine {
	public void tryInvestment(Player player) {
		//Generate type
		InvestType[] types = new InvestType[3];
		
		for (int i = 0; i < 3; i++) {
			InvestType genType;
			while ((genType = generateInvestType()) != null) {
				if (!Arrays.asList(types).contains(genType)) {
					types[i] = genType;
					break;
				}
			}
		}
		
		
		System.out.println("Инвестирайте разумно и изберете компания:");
		//make player choose types
		for (int i = 0; i < 3; i++) {
			Invest investToChoose = new Invest(types[i]);
			
			System.out.println("(" + (i+1) + ")" + 
			investToChoose.getType().toString() + " | " +
					"invest : " + investToChoose.getMinInvestment() +
					" reward : " + investToChoose.getCoefficient()
					);
		}
		//I don't want to invest
		System.out.println("(0) Не ми се инвестира повече.");
		//input
		int choise = com.littlecats.scanner.Scan.scan.nextInt();
		if (choise > 0) {
			//Choose sum of investment
			double investSum;
			Invest inv = new Invest(types[choise - 1]);
			do {
				System.out.println("Enter invest sum >= " + inv.getMinInvestment());
				investSum = com.littlecats.scanner.Scan.scan.nextDouble();
			} while (investSum < inv.getMinInvestment());
		
			inv.setInvestSum(investSum);
			//Add Investment
		
			player.addInvestment(inv);
			player.addMoney(-investSum);
		}
	}
	
	private InvestType generateInvestType() {
		Random rand = new Random();
		
		int investnumber = rand.nextInt(InvestType.values().length);
		return InvestType.values()[investnumber];
	}
}
