public class MacBookBlueprint extends Blueprint
{
	private Computer computer;
	
	public MacBookBlueprint()
	{
		// TODO Auto-generated constructor stub
		computer = new Computer("default cpu","default ram","default storage");
	}
	
	@Override
	public void setCpu()
	{
		// TODO Auto-generated method stub
		computer.setCpu("apple - i7");
	}

	@Override
	public void setRam()
	{
		// TODO Auto-generated method stub
		computer.setRam("16g");
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
