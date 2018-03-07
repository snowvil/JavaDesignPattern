
public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Bridge Pattern - 기능 부분과 구현 부분을 분리하는 패턴
		// https://youtu.be/YrnXcoSvgyE
		
		// 구현부분 - 기본 모스 기호
		PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
		code.g().a().r().a().m();
		
		// 구현부분 - 사운드 모스 기호
		PrintMorseCode code2 = new PrintMorseCode(new SoundMCF());
		code2.g().a().r().a().m();

		// 구현부분 - 빛 모스 기호
		PrintMorseCode code3 = new PrintMorseCode(new FlashMCF());
		code3.g().a().r().a().m();
		
	}

}
