package com.littlecats.steal;

import java.util.Random;

public class StealGenerator {
	public Steal getRandomSteal() {
		Random rand = new Random();
		
		int stype = rand.nextInt(3);
		
		if (stype == 0) {
			return new Steal(StealType.TAKE_OVER_WORLD);
		} else if (stype == 1) {
			return new Steal(StealType.HOSTAGE);
		} else {
			return new Steal(StealType.BIG_BANK_ROBBERY);
		}
	}
}
