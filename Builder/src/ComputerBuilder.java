
public class ComputerBuilder
{
	private Computer computer;
	
	public ComputerBuilder()
	{
		// TODO Auto-generated constructor stub
		computer = new Computer("default cpu", "default ram", "default storage");
	}


	public static ComputerBuilder start()
	{
		// TODO Auto-generated method stub
		return new ComputerBuilder();
	}
	
	public ComputerBuilder setCpu(String strCpu)
	{
		computer.setCpu(strCpu);
		return this;
	}

	public ComputerBuilder setRam(String strRam)
	{
		computer.setRam(strRam);
		return this;
	}
	
	public ComputerBuilder setStorage(String strStorage)
	{
		computer.setStorage(strStorage);
		return this;
	}
	

	public Computer build()
	{
		return this.computer;
	}
	
}
