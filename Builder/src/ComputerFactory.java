
public class ComputerFactory
{

	private Blueprint bluePrint;
	
	public void setBluePrint(Blueprint bluePrint)
	{
		this.bluePrint = bluePrint;
	}
	

	public void make()
	{
		bluePrint.setCpu();
		bluePrint.setRam();
		bluePrint.setStorage();
	}
	
	public Computer getComputer()
	{
		return bluePrint.getComputer();
	}
	
}
