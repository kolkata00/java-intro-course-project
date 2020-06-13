package com.littlecats.board;

import java.util.Random;

public class Dice {
	public int Roll(int sides) {
		Random rand = new Random();
		return rand.nextInt(sides - 1) + 1;
	}
}
