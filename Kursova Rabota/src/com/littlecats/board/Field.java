package com.littlecats.board;
import com.littlecats.traps.*;

public class Field {
	FieldType type;
	Trap trap;
	

	public Field(FieldType type) {
		super();
		this.type = type;
	}
	
	public char getFieldLetter() {
		return this.type.toString().charAt(0);
	}
	
	public Trap getTrap() {
		return trap;
	}

	public void setTrap(Trap trap) {
		this.trap = trap;
	}
}
