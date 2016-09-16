package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Jeffery", .5, 2 , 4, 1, false);
		keyboardInput = new Scanner(System.in);
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
		
		System.out.println("Do you want to change him?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("Yes"))
		{
			System.out.println("Ok, what do you want to change, name, eyes, legs, nose, hair, or arms?");
			String bodyInput = keyboardInput.nextLine();
			
			if (bodyInput.equalsIgnoreCase("Name"))
			{
				System.out.println("What would you like the name of the monster to be?");
				String nameInput = keyboardInput.nextLine();
				firstMonster.setName(nameInput);
			}
			
			System.out.println(firstMonster);
		}
		else if (answer.equalsIgnoreCase("No"))
		{
			System.out.println("Ok, bye.");
		}
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
