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
		String positive = "���� � �������� ��� �� ���.";
		String negative = "�� ������� ������ ������.";
		if (chanceType == ChanceType.NIGHTS_1001) {
			return negative.concat("������� ������� ����� �����, ��" + 
					"�� ������ ���� �� �������� ��" + 
					"���������� �������. � ����" + 
					"������������, �� ����������� �� �" + 
					"���������.");
		} else if (chanceType == ChanceType.FAIRY_BAUL) {
			return negative.concat( "��� ��� ���� �� ��� ������������," + 
					"������ ������ �� ��������" + 
					"�������.");
		}else if (chanceType == ChanceType.WAR_AND_PEACE) {
			return negative.concat("���-������� �� ��������" + 
					"�������� ������������ ��" + 
					"���������. ������ ������" + 
					"��������.");
		}else if (chanceType == ChanceType.CRIME_AND_PUNISHMENT) {
			return negative.concat("�� ������� �� ������������," + 
					"�������� �� ������ �� �� �����." + 
					"�������� �� � ����������," + 
					"����������� ������, �� �� ������" + 
					"�� ������ ���������, ����� �����" + 
					"�� ���������� �� ����� ����� �" + 
					"������ �� ������ ��������.");
		}else if (chanceType == ChanceType.GRAPES_OF_RAGE) {
			return negative.concat("���� �� ��������� �� �������," + 
					"������ �������� �� �������� ��" + 
					"����� ������.");	
		}else if (chanceType == ChanceType.HIGH_HOPES) {
			return positive.concat("����������� �����" + 
					"��������, �� �� �� ��������" + 
					"���������� ������." + 
					"���������� ����� �� ���" + 
					"�������, ����������" + 
					"������������ ������� ��" + 
					"����������.");
		}else if (chanceType == ChanceType.LOLLITA) {
			return positive.concat("������� �� ����� �����" + 
					"����� ����� � ������" + 
					"�����������. ����������" + 
					"������� �������� ��" + 
					"����������� ������, �����" + 
					"� ���������� ������ ��" + 
					"����� �����.");
		}else if (chanceType == ChanceType.PRIDE_AND_PREJUDICES) {
			return positive.concat("��������� ������������ �" + 
					"������� ��������. �������!");
		}else if (chanceType == ChanceType.MASTER_OF_FLYES) {
			return positive.concat("����������� ����������" + 
					"�������� ���� ��" + 
					"��������������� ��" + 
					"����������������" + 
					"��������. ����������" + 
					"�������� �����.");
		} else {
			return positive.concat("������� ������ �� �����" + 
					"��������, ���������� �" + 
					"������� �� �������������" + 
					"���������� � � ���������." + 
					"���������� ��� ��� �" + 
					"�����������.");
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
