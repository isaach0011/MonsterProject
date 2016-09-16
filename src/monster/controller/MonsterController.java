package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Jeffery", .5, 2 , 4, 1, false);
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("Here is mine " + firstMonster);
		System.out.println("He has " + firstMonster.getEyeCount() + " eyes.");
		System.out.println("He has " + firstMonster.getLegCount() + " legs. ");
		System.out.println("He has " + firstMonster.getNoseCount() + " nose.");
		System.out.println("Does he have hair? " + firstMonster.getHasHair() + ".");
		System.out.println("He has " + firstMonster.getArmCount() + " arms.");
	}
	
	/*
	 * Monster name is Jeffery
	 * has .5 arms
	 * has 2 eyes
	 * has 4 legs
	 * has 1 nose
	 * has no hair
	 */
}
