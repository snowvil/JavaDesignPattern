
public class Age
{
	private int year;
	private int value;
	
	
	
	public Age(int year, int value)
	{
		super();
		this.year = year;
		this.value = value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
}
