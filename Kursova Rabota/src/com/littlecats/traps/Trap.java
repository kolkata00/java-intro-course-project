package com.littlecats.traps;

import com.littlecats.players.*;

public class Trap {
	TrapType type;
	GamePlayer createdByPlayer;

	public Trap(TrapType type, GamePlayer createdByPlayer) {
		super();
		this.type = type;
		this.createdByPlayer = createdByPlayer;
	}

	public TrapType getType() {
		return type;
	}

	public GamePlayer getCreatedByPlayer() {
		return createdByPlayer;
	}
	public static int getMinInvest(TrapType type) {
		if (type == TrapType.REVISION) {
			return 100;
		} else if (type == TrapType.DIVORCE) {
			return 200;
		} else if (type == TrapType.PROPAGANDA) {
			return 100;
		} else if (type == TrapType.PEEK) {
			return 50;
		} else {
			return 100;
		}
	}
}
