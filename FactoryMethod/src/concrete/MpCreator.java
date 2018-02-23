package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator
{
	@Override
	protected Item createItem()
	{
		// TODO Auto-generated method stub
		return new MpPotion();
	}

	@Override
	protected void createItemLog()
	{
		// TODO Auto-generated method stub
		System.out.println("마력 회복 물약을 새로 생성 했습니다." + new Date());

	}

	@Override
	protected void requestItemsInfo()
	{
		// TODO Auto-generated method stub
		System.out.println("데이터베이스에서 마력 회복 물약의 정보를 가져옵니다.");

	}
}
