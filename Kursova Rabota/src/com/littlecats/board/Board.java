package com.littlecats.board;

import java.util.Random;
import com.littlecats.players.*;

public class Board {
	Field[] boardFields = new Field[20];
	Dice dice;
	Player player;
	Computer computer;
	
	public Board() {
		dice = new Dice();
		player = new Player();
		computer = new Computer();
		generateFields();
	}
	
	public Field getField(int index) {
		return boardFields[index];
	}
	
	public void generateFields() {

		//Start
		boardFields[0] = new Field(FieldType.START);
		//Traps
		Random rand = new Random();
		
		for (int i = 0; i < 7; i++) {
			int index = 0;
			while(boardFields[index] != null) {
				index = rand.nextInt(19) + 1;
			}
			
			boardFields[index] = new Field(FieldType.TRAP);
		}
		
		for (int i = 0; i < 3; i++) {
			int index = 0;
			while(boardFields[index] != null) {
				index = rand.nextInt(19) + 1;
			}
			
			boardFields[index] = new Field(FieldType.INVEST);
		}
		
		for (int i = 0; i < 3; i++) {
			int index = 0;
			while(boardFields[index] != null) {
				index = rand.nextInt(19) + 1;
			}
			
			boardFields[index] = new Field(FieldType.PARTY_HARD);
		}
		
		for (int i = 0; i < 3; i++) {
			int index = 0;
			while(boardFields[index] != null) {
				index = rand.nextInt(19) + 1;
			}
			
			boardFields[index] = new Field(FieldType.CHANCE);
		}
		
		for (int i = 0; i < 3; i++) {
			int index = 0;
			while(boardFields[index] != null) {
				index = rand.nextInt(19) + 1;
			}
			
			boardFields[index] = new Field(FieldType.STEAL);
		}
	}
	public void printBoard() {
		//9 -15
		for (int i = 10; i < 18; i++) {
			System.out.print("|" + boardFields[i].getFieldLetter() + "| ");
		}
		System.out.println();
		//9 i 19
		System.out.print("|" + boardFields[9].getFieldLetter() + "| ");
		for(int i = 0; i < 6; i++) {
			System.out.print("    ");
		}
		System.out.print("|" + boardFields[18].getFieldLetter() + "| ");
		System.out.println();
		//8 i 20
		//9 i 19
		System.out.print("|" + boardFields[8].getFieldLetter() + "| ");
		for(int i = 0; i < 6; i++) {
			System.out.print("    ");
		}
		System.out.print("|" + boardFields[19].getFieldLetter() + "| ");
		System.out.println();
		//7 - 0
		for (int i = 7; i >= 0; i--) {
			System.out.print("|" + boardFields[i].getFieldLetter() + "| ");
		}
		
		System.out.println();
	}
}
