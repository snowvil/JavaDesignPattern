import concrete.HpCreator;
import concrete.MpCreator;
import framework.Item;
import framework.ItemCreator;


public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		// Factory Method Pattern - 생성의 템플릿 메소드 패턴
		// 팩토리 메소드 패턴에서 템플릿 메소드 패턴의 사용됨을 안다.
		// 팩토리 메소드 패턴에서의 구조와 구현의 분리를 이해하고 구조와 구현의 분리의 장점을 안다.
		// https://youtu.be/-gyoG-7MHLI
		
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
		
	}

}
