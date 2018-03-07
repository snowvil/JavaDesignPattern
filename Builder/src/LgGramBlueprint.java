public class LgGramBlueprint extends Blueprint
{
	private Computer computer;
	
	public LgGramBlueprint()
	{
		// TODO Auto-generated constructor stub
		computer = new Computer("default cpu","default ram","default storage");
	}
	
	@Override
	public void setCpu()
	{
		// TODO Auto-generated method stub
		computer.setCpu("lg - i7");
	}

	@Override
	public void setRam()
	{
		// TODO Auto-generated method stub
		computer.setRam("8g");
	}

	@Override
	public void setStorage()
	{
		// TODO Auto-generated method stub
		computer.setStorage("256gb ssd");
	}
	
	
	@Override
	public Computer getComputer()
	{
		return computer;
	}
}
