package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double armCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasHair;
	
	public MarshmallowMonster()
	{
		this.name = "Jeffery";
		this.armCount = -23122.34;
		this.eyeCount = -452452;
		this.legCount = -12312;
		this.noseCount = -1;
		this.hasHair = false;
	}
	
	public MarshmallowMonster(String name, double armCount, int eyeCount, int legCount, int noseCount, boolean hasHair)
	{
		this.name = name;
		this.armCount = armCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasHair = hasHair;
	}
	
	public String toString()
	{
		String description = "Monster says: His name is " + name;
		
		return description;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getHasHair()
	{
		return hasHair;
	}
	
	public int getLegCount()
	{
		return legCount;

	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public double getArmCount()
	{
		return armCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHasHair(boolean hasHair)
	{
		this.hasHair = hasHair;
	}
	
	public void setLegCount(int legCount)
	{
		this.legCount = legCount;
	}
	
	public void setNoseCount(int noseCount)
	{
		this.noseCount = noseCount;
	}
	
	public void setEyeCount(int eyeInput)
	{
		this.eyeCount = eyeInput;
	}
	
	public void setArmCount(double armCount)
	{
		this.armCount = armCount;
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
