
public class GameCharacter
{

	private WeaponInterface weapon;
	
	public void setWeapon(WeaponInterface weapon)
	{
		this.weapon = weapon;
	}
	
	public void attack()
	{
		if(weapon == null)
		{
			System.out.println("Punch Attack");
			return ;
		}
		// 델리게이트
		weapon.attack();
	}
}
