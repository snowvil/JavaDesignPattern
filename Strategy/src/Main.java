public class Main
{
	public Main()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// Strategy Pattern - 전약 바꾸기 패턴
		// 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 서로 교환 가능하도록 하는 패턴
		// https://youtu.be/UEjsbd3IZvA
		
		//Ainterface a = new AinterfaceImpl();
		//a.funcA();
		
		//AObj obj = new AObj();
		//obj.funcAA();
		
		GameCharacter character = new GameCharacter();

		character.attack();
		
		character.setWeapon(new Knife());
		character.attack();
		
		character.setWeapon(new Sword());
		character.attack();
		
		character.setWeapon(new Axe());
		character.attack();
		
	}
}
