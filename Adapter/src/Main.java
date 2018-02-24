public class Main
{
	public Main()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// Adapter Pattern - 연관성 없는 두 객체 묶어 사용하기
		// 알고리즘을 요구사항에 맞춰 사용할 수 있다.
		// https://youtu.be/gJDZ7pcvlAU
		
		Adapter adapter = new AdapterImpl();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(100f));
	}

}
