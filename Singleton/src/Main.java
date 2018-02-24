
public class Main
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// Singleton Pattern - 단일(전역) 객체 생성 패턴
		// https://youtu.be/5jgpu9-ywtY
		
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println("Speaker1 :: " + speaker1.getVolume());
		System.out.println("Speaker2 :: " + speaker2.getVolume());

		// 각각의 인스턴스를 조작해도 전역적으로 반영이 되는지 확인
		speaker1.setVolume(11);
		System.out.println("Speaker1 :: " + speaker1.getVolume());
		System.out.println("Speaker2 :: " + speaker2.getVolume());
		
		
		speaker2.setVolume(22);
		System.out.println("Speaker1 :: " + speaker1.getVolume());
		System.out.println("Speaker2 :: " + speaker2.getVolume());
	
	}

}
