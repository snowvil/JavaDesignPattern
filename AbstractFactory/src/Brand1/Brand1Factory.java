package Brand1;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class Brand1Factory implements BikeFactory
{

	@Override
	public Body createBody()
	{
		// TODO Auto-generated method stub
		return new Brand1Body();
	}

	@Override
	public Wheel createWheel()
	{
		// TODO Auto-generated method stub
		return new Brand1Wheel();
	}

}
