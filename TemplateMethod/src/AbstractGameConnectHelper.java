public abstract class AbstractGameConnectHelper
{
	protected abstract String doSecurity(String string);

	protected abstract boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);

	
	// 템플릿 메소드
	public String requestConnection(String encodedInfo)
	{
		// 보안 작업 -> 암호화된 문자열을 복호화
		String decodedInfo = doSecurity(encodedInfo);
		
		String id = "aaa";
		String password = "bbb"; 
		String userName = "ccc";
		// 권한 과정
		boolean bAuth = authentication(id, password);
		
		if(false == bAuth)
		{
			throw new Error("아이디 암호 불일치");
		}
		
		int i = authorization(userName);
		if(i < 0)
		{
			throw new Error("셧다운 접속금지");
		}
		switch (i)
		{
		case 0:
			System.out.println("개인 매니저");
			break;
		case 1:
			System.out.println("유료 회원");
			break;
		case 2:
			System.out.println("무료 회원");
			break;
		case 3:
			System.out.println("권한없음");
			break;			
		default:
			System.out.println("권한없음");
			break;
		}
		
		return connection(decodedInfo);
	}
}
