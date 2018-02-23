public class Main
{
	public Main()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
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
