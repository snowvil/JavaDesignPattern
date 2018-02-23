public class Main
{
	public Main()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{

		AbstractGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("aaaaaaaaaaaaaaaaaaa");
	}
}
