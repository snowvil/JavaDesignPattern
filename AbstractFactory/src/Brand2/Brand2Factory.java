package Brand2;

import abst.BikeFactory;
import abst.Body;
import abst.Wheel;

public class Brand2Factory implements BikeFactory
{

	@Override
	public Body createBody()
	{
		// TODO Auto-generated method stub
		return new Brand2Body();
	}

	@Override
	public Wheel createWheel()
	{
		// TODO Auto-generated method stub
		return new Brand2Wheel();
	}

}
