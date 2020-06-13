package com.littlecats.chances;

public class Chance {
	ChanceType chanceType;
	public Chance(ChanceType chanceType){
		this.chanceType = chanceType;
	}

	public ChanceType getChanceType() {
		return this.chanceType;
	}
	
	public String getChanceText() {
		String positive = "Днес е радостен ден за вас.";
		String negative = "Ти изтегли късата клечка.";
		if (chanceType == ChanceType.NIGHTS_1001) {
			return negative.concat("Вдигате толкова голям купон, че" + 
					"не знаете къде се намирате на" + 
					"следващата седмица. С мъка" + 
					"установявате, че телевизорът Ви е" + 
					"откраднат.");
		} else if (chanceType == ChanceType.FAIRY_BAUL) {
			return negative.concat( "Вие сте баща на три абитуриентки," + 
					"бъдете готови за стабилни" + 
					"разходи.");
		}else if (chanceType == ChanceType.WAR_AND_PEACE) {
			return negative.concat("Най-добрият Ви служител" + 
					"получава повиквателна за" + 
					"казармата. Губите обучен" + 
					"персонал.");
		}else if (chanceType == ChanceType.CRIME_AND_PUNISHMENT) {
			return negative.concat("На връщане от супермаркета," + 
					"чудовище се опитва да ви изяде." + 
					"Справяте се с неприятеля," + 
					"използвайки карате, но се налага" + 
					"да пишете обяснения, които водят" + 
					"до пропускане на важна среща и" + 
					"загуба на бизнес партньор.");
		}else if (chanceType == ChanceType.GRAPES_OF_RAGE) {
			return negative.concat("Част от бизнесите Ви фалират," + 
					"заради задаваща се епидемия от" + 
					"потна треска.");	
		}else if (chanceType == ChanceType.HIGH_HOPES) {
			return positive.concat("Осиновявате група" + 
					"сирачета, за да си вдигнете" + 
					"социалното реноме." + 
					"Социалните мрежи са във" + 
					"възторг, получавате" + 
					"окуражителни дарения от" + 
					"обществото.");
		}else if (chanceType == ChanceType.LOLLITA) {
			return positive.concat("Хващате си младо гадже" + 
					"малка котка с големи" + 
					"възможности. Получавате" + 
					"вечното уважение на" + 
					"кварталните пичове, както" + 
					"и легендарен статус на" + 
					"вечен играч.");
		}else if (chanceType == ChanceType.PRIDE_AND_PREJUDICES) {
			return positive.concat("Напускате университета и" + 
					"ставате милионер. Честито!");
		}else if (chanceType == ChanceType.MASTER_OF_FLYES) {
			return positive.concat("Тийнейджъри представят" + 
					"гениална идея за" + 
					"рационализиране на" + 
					"производствените" + 
					"мощности. Получавате" + 
					"стабилен бонус.");
		} else {
			return positive.concat("Наемате джудже за личен" + 
					"асистент, обществото е" + 
					"уверено че междувидовата" + 
					"сегрегация е в историята." + 
					"Уважението към вас е" + 
					"безгранично.");
		}
	}
	
	public double getChanceBenifit() {
		if (chanceType == ChanceType.NIGHTS_1001) {
			return -50;
		} else if (chanceType == ChanceType.FAIRY_BAUL) {
			return -100;
		}else if (chanceType == ChanceType.WAR_AND_PEACE) {
			return -150;
		}else if (chanceType == ChanceType.CRIME_AND_PUNISHMENT) {
			return -200;
		}else if (chanceType == ChanceType.GRAPES_OF_RAGE) {
			return -250;	
		}else if (chanceType == ChanceType.HIGH_HOPES) {
			return 50;
		}else if (chanceType == ChanceType.LOLLITA) {
			return 100;
		}else if (chanceType == ChanceType.PRIDE_AND_PREJUDICES) {
			return 150;
		}else if (chanceType == ChanceType.MASTER_OF_FLYES) {
			return 200;
		} else {
			return 250;
		}
	}
}
