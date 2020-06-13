package com.littlecats.main;
import java.io.IOException;

import com.littlecats.board.*;
import com.littlecats.engine.GameEngine;

public class Main {

	public static void main(String[] args) {
		GameEngine engine = new GameEngine();
		
		try {
			engine.Play();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
