public class Main
{
	public Main()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		// Template Method Pattern - 공통적인 프로세스를 묶어 주기
		// 일정한 프로세스를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현할 수 있다.
		// https://youtu.be/qr7I18Lhsl8
		
		
		// 게임에 접속되는 과정을 미리 정의해 두고 구현클래스에서는 각각의 기능만을 구현하는 패턴
		AbstractGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("Connection String Here");
	}
}
