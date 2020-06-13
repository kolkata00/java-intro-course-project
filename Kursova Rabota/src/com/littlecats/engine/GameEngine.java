package com.littlecats.engine;

import java.io.IOException;

import com.littlecats.board.*;
import com.littlecats.players.*;
import com.littlecats.steal.StealGenerator;

public class GameEngine {
	Board gameboard = new Board();
	GamePlayer[] players;
	int turn;
	Dice dice = new Dice();
	
	
	public GameEngine() {
		
		players = new GamePlayer[2];
		
		players[0] = new Player();
		players[1] = new Computer();
	}
	
	public void Play() throws IOException {
		//Print board
		gameboard.printBoard();
		//Begin game
		while(true) {
			//Runtime.getRuntime().exec("cls");
			System.out.println("Player " + (turn + 1) + " rolls the dice ...");
			//roll the dice and move
			int move = dice.Roll(2);
			
			//Check if start hit
			if (players[turn].getOnField() + move >= 20) {
				calculateStart();
				
				//Check if player lost
				if (players[turn].getMoney() <=0) {
					System.out.println("Player " + (turn + 1) + " has LOST the game!!!");
					break;
				}
			}
			
				
			players[turn].setOnField((players[turn].getOnField() + move) % 20);
			//choose action
			switch (gameboard.getField(players[turn].getOnField()).getFieldLetter()) {
			case 'T': 
				trap();
				break;
			case 'I' :
				invest();
				break;
			case 'P' :
				partyHard();
				break;
			case 'C':
				chance();
				break;
			case 'S' :
				steal();
				break;
			}
			//print players info
			for (int i = 0; i < players.length; i++) {
				System.out.println(players[i].toString());
			}
			//change player turn
			if (turn < players.length - 1) {
				turn++;
			} else {
				turn = 0;
			}
		}
	}
	
	public Board getGameboard() {
		return gameboard;
	}

	public void setGameboard(Board gameboard) {
		this.gameboard = gameboard;
	}

	private void trap() {
		//Set Trap on board
		int currentfield = players[turn].getOnField();
		if (gameboard.getField(currentfield).getTrap() == null) {
			gameboard.getField(currentfield).setTrap(players[turn].chooseTrap());
		} else {
			players[turn].addActiveTrap(gameboard.getField(currentfield).getTrap());
		}
	}
	
	private void invest() {
		players[turn].chooseInvest();
	}
	
	private void partyHard() {
		players[turn].partyHard();
	}
	
	private void chance() {
		players[turn].chance();
	}
	
	private void steal() {
		StealGenerator stGen = new StealGenerator();
		players[turn].setSteal(stGen.getRandomSteal());
		players[turn].steal();
	}
	
	private void calculateStart() {
		for (int i = 0; i < players.length; i++) {
			//activate investements
			for (int j = 0; j < players[i].getInvestments().size(); j++) {
				players[i].addMoney(players[i].getInvestments().get(j).getOutcome());
			}
		}
	}
}
