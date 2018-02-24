
public class AdapterImpl implements Adapter
{

	@Override
	public Float twiceOf(Float f)
	{
		// Math 라이브러리를 수정하지 않고 Float를 반환하는 함수를 제공
		return Math.doubled(f.doubleValue()).floatValue();
	}
	
	@Override
	public Float halfOf(Float f)
	{
		// Math 라이브러리를 수정하지 않고 Float를 반환하는 함수를 제공
		System.out.println("Call - halfOf Start");
		return (float)Math.half(f.doubleValue());
	}

}
