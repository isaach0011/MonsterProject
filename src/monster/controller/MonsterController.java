package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	private int i;
	private int k;

	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Jeffery", .5, 2 , 4, 1, false);
		keyboardInput = new Scanner(System.in);
		i = 1;
		k = 1;
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		monsterChange();
		
		while (k == 1)
		{
			System.out.println("Do you want to change him?");
			String answer = keyboardInput.nextLine();
			
			i = 1;
			if (answer.equalsIgnoreCase("Yes"))
			{
				while (i == 1)
				{
					changeMenu();
				
					for (int j = 1; j <= 3; j++)
					{
						System.out.println("Changing Monster ..." + j + "/3");
						try
						{
							TimeUnit.MILLISECONDS.sleep(500);
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
				k++;
			}
			else
			{
				k = 1;
			}
			System.out.println("Are you sure you are done?");
			String doneInput = keyboardInput.nextLine();

			if (doneInput.equalsIgnoreCase("Yes"))
			{
				k++;
			}
			if (doneInput.equalsIgnoreCase("No"))
			{
				k = 1;
			}
		}
		System.out.println("Ok, Goodbye.");
		
		for (int n = 1; n <= 3; n++)
		{
			System.out.println("Closing Program ..." + n + "/3");
			try
			{
				TimeUnit.MILLISECONDS.sleep(500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("<terminated>");
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

	private void changeMenu()
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
			keyboardInput.nextLine();
		}
		if (bodyInput.equalsIgnoreCase("legs"))
		{
			System.out.println("How many legs does this monster have?");
			int legInput = keyboardInput.nextInt();
			firstMonster.setLegCount(legInput);
			keyboardInput.nextLine();
		}
		if (bodyInput.equalsIgnoreCase("nose"))
		{
			System.out.println("How many noses does this monster have?");
			int noseInput = keyboardInput.nextInt();
			firstMonster.setNoseCount(noseInput);
			keyboardInput.nextLine();
		}
		if (bodyInput.equalsIgnoreCase("hair"))
		{
			System.out.println("Does this monster have hair? ( true / false )");
			boolean hairInput = keyboardInput.nextBoolean();
			firstMonster.setHasHair(hairInput);
		}
		if (bodyInput.equalsIgnoreCase("arms"))
		{
			System.out.println("How many arms does this monster have?");
			int armInput = keyboardInput.nextInt();
			firstMonster.setArmCount(armInput);
			keyboardInput.nextLine();
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
