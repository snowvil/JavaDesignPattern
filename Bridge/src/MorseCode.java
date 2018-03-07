public class MorseCode
{
	private MorseCcodeFunction function;

	public MorseCode(MorseCcodeFunction function)
	{
		super();
		this.function = function;
	}

	public void setFunction(MorseCcodeFunction function)
	{
		this.function = function;
	}

	public void dot()
	{
		function.dot();
		
	}

	public void dash()
	{
		function.dash();
	}

	public void space()
	{
		function.space();
	}
}
