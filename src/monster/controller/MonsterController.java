package monster.controller;

import monster.model.MarshmallowMonster;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	private int i;

	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Jeffery", .5, 2 , 4, 1, false);
		keyboardInput = new Scanner(System.in);
		i = 1;
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		monsterChange();
		
		System.out.println("Do you want to change him?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("Yes"))
		{
			while (i == 1)
			{
				System.out.println("Ok, what do you want to change, name, eyes, legs, nose, hair, or arms?");
				String bodyInput = keyboardInput.nextLine();
				
				if (bodyInput.equalsIgnoreCase("Name"))
				{
					System.out.println("What would you like the name of the monster to be?");
					String nameInput = keyboardInput.nextLine();
					firstMonster.setName(nameInput);
				}
				if (bodyInput.equalsIgnoreCase("eyes"))
				{
					System.out.println("How many eyes does the monster have?");
					int eyeInput = keyboardInput.nextInt();
					firstMonster.setEyeCount(eyeInput);
					keyboardInput.next();
				}
				for (int j = 1; j <= 3; j++)
				{
					System.out.println("Changing Monster ..." + j + "/3");
					try
					{
						TimeUnit.SECONDS.sleep(1);
					}
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				monsterChange();
				System.out.println("Would you like to change anything else?");
				String backInput = keyboardInput.nextLine();
				if (backInput.equalsIgnoreCase("Yes"))
				{
					i = 1;
				}
				else if (backInput.equalsIgnoreCase("No"))
				{
					i++;
				}
			}
		}
		
		else if (answer.equalsIgnoreCase("No"))
		{
			System.out.println("Nothing changed...");
		}
		System.out.println("Ok, Goodbye." + i);
		
		for (int n = 1; n <= 3; n++)
		{
			System.out.println("Closing Program ..." + n + "/3");
		}
		System.out.println("Program terminated");
	}
	
	private void monsterChange()
	{
		System.out.println(firstMonster);
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
