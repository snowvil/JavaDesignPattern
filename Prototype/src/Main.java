
public class Main
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub

		// Prototype Pattern - 생산 비용을 줄이는 패턴
		
		// 복잡한 인스턴스를 복사할수 있다. ( 생산비용이 높은 인스턴스를 복사를 통해서 간단하게 생성하는 패턴 )
		// 인스턴스 생산 비용이 높은 경우 -> 1) 종류가 많아 클래스 정리 어려움, 2) 클래스로부터 인스턴스 생성이 어려운 경우
		
		// 요구사항
		// 일러스트레이터와 같은 그림 그리기 툴을 개발 중입니다. 어떤 모양(Shape) 그릴 수 있도록 하고 복사 붙여넣기 기능을 구현하라.
		
		// https://youtu.be/oWsS67joKJA
		
		Circle circle1 = new Circle(1,1,3);
		Circle circle2 = circle1.copy();
		
		System.out.println(circle1.getX() + ", " + circle1.getY() + ", " + circle1.getR());		
		System.out.println(circle2.getX() + ", " + circle2.getY() + ", " + circle2.getR());
		
		//===================================================================================
		
		Cat navi = new Cat();
		navi.setName("Navi");
		navi.setAge(new Age(2015, 3));
		
		// Deep Copy
		Cat yo = navi.clone();
		yo.setName("yo");
		
		yo.getAge().setYear(2016);
		yo.getAge().setValue(2);
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());

		System.out.println(navi.getAge().getYear());
		System.out.println(yo.getAge().getYear());
		
	}

}
