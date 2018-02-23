public class DefaultGameConnectHelper extends AbstractGameConnectHelper
{
	@Override
	protected boolean authentication(String id, String password)
	{
		// TODO Auto-generated method stub
		System.out.println("Authentication");
		return true;
	}

	@Override
	protected int authorization(String userName)
	{
		// TODO Auto-generated method stub
		System.out.println("authorization");
		// 서버에서 유저이름 유저의 나이를 확인하고 10시보다 늦으면 접속금지
		return 0;
	}

	@Override
	protected String connection(String info)
	{
		// TODO Auto-generated method stub
		System.out.println("connection");
		return info;
	}

	@Override
	protected String doSecurity(String string)
	{
		// TODO Auto-generated method stub
		System.out.println("doSecurity");
		return string;
	}
}
