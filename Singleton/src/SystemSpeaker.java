
public class SystemSpeaker
{
	static private SystemSpeaker instance;
	private int volume;
	
	// 기본생성자를 private 처리해서 생성금지
	private SystemSpeaker()
	{
		volume = 5;
	}
	
	// 하나의 인스턴스만을 돌려준다.(전역 객체 사용)
	public static SystemSpeaker getInstance()
	{
		if(instance == null)
		{
			instance = new SystemSpeaker();
			System.out.println("new SystemSpeaker");
		}
		else
		{
			System.out.println("already exists SystemSpeaker");
		}
		
		return instance;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void setVolume(int volume)
	{
		this.volume = volume;
	}
}
