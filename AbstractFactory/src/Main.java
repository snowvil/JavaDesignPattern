import Brand1.Brand1Factory;
import Brand2.Brand2Factory;
import abst.BikeFactory;
import abst.Body;
import abst.Wheel;


public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 추상 팩토리 패턴
		// 관련 있는 객체의 생성을 가상화 할 수 있다.
		// https://youtu.be/qXcxySA-Qes
		
		// Brand1 Bike 생성
		{
			BikeFactory factory = new Brand1Factory();
			Body body = factory.createBody();
			Wheel wheel = factory.createWheel();
			
			System.out.println(body.getClass());
			System.out.println(wheel.getClass());			
		}

		// Brand2 Bike 생성
		{
			BikeFactory factory = new Brand2Factory();
			Body body = factory.createBody();
			Wheel wheel = factory.createWheel();
			
			System.out.println(body.getClass());
			System.out.println(wheel.getClass());			
		}
		
		
	}

}
