
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		// Builder Pattern
		// 복잡한 단계를 거쳐야 생성되는 객체의 구현을 서브 클래스에게 넘겨주는 패턴
		// https://youtu.be/SWbW5ZzeARU

		// 일반적인 객체 생성의 경우 구현체가 많아지면 매번 설정해야 하는 단점이 있다.
		//Computer computer = new Computer("i7", "16g", "256gb ssd");
		//System.out.println(computer.toString());
		
		//=======================================================================
		// Example 1
		ComputerFactory factory = new ComputerFactory();
		
		// LG - gram builder
		factory.setBluePrint(new LgGramBlueprint());
		factory.make();
		Computer lgComputer = factory.getComputer();
		System.out.println(lgComputer.toString());
		
		// Apple - MacBook builder
		factory.setBluePrint(new MacBookBlueprint());
		factory.make();
		Computer appleComputer = factory.getComputer();
		System.out.println(appleComputer.toString());
		
		//=======================================================================
		

		
		//=======================================================================
		// Example 2 - 인자가 많을 경우 생성 패턴
		Computer computer = ComputerBuilder
				.start()
				.setCpu("i7")
				.setRam("8g")
				.build();
		System.out.println(computer.toString());
		//=======================================================================
		
	}

}
