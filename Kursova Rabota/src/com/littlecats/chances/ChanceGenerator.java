package com.littlecats.chances;

import com.littlecats.board.Dice;

public class ChanceGenerator {
	public Chance getChance() {
		Dice dice = new Dice();
		int diceNumber = dice.Roll(10);
		
		if (diceNumber % 2 == 0) {
			//generate positive
			int chance = dice.Roll(100);
			return new Chance(getChanceByDice(chance, true));
			
		} else {
			//generate negative
			int chance = dice.Roll(100);
			return new Chance(getChanceByDice(chance, false));
		}
	}
	
	private ChanceType getChanceByDice(int dice, boolean positive) {
		if (positive) {
			if (dice >= 1 && dice <= 39) {
				return ChanceType.HIGH_HOPES;
			} else if (dice >= 40 && dice <= 65) {
				return ChanceType.LOLLITA;
			} else if (dice >= 65 && dice <= 79) {
				return ChanceType.PRIDE_AND_PREJUDICES;
			} else if (dice >=80 && dice <= 94) {
				return ChanceType.MASTER_OF_FLYES;
			} else {
				return ChanceType.HOBBIT;
			}
		} else {
			if (dice >=1 && dice<=39) {
				return ChanceType.NIGHTS_1001;
			} else if (dice >= 40 && dice <= 65) {
				return ChanceType.FAIRY_BAUL;
			} else if (dice >= 65 && dice <= 79) {
				return ChanceType.WAR_AND_PEACE;
			} else if (dice >= 80 && dice <= 94) {
				return ChanceType.CRIME_AND_PUNISHMENT;
			} else {
				return ChanceType.GRAPES_OF_RAGE;
			}
		}
	}
	
	public Chance getPositiveChance() {
		Dice dice = new Dice();
		int chance = dice.Roll(100);
		return new Chance(getChanceByDice(chance, true));
	}
	
	public Chance getNegativeChance() {
		Dice dice = new Dice();
		int chance = dice.Roll(100);
		return new Chance(getChanceByDice(chance, false));
	}
}
