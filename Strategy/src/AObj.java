
// 델리게이트 설명을 위한 클래스

public class AObj
{
	Ainterface ainterface;
	
	public AObj()
	{
		// TODO Auto-generated constructor stub
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA()
	{
		// 위임한다.(델리케이트)
		ainterface.funcA();
		ainterface.funcA();
	}
}
