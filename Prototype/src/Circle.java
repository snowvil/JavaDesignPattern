
public class Circle extends Shape
{
	// 중심 좌표와 반지름
	private int x,y,r;

	public Circle(int x, int y, int r)
	{
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public int getR()
	{
		return r;
	}

	public void setR(int r)
	{
		this.r = r;
	}
	
	// 복사 메소드 구현
	public Circle copy() throws CloneNotSupportedException
	{
		Circle circle = (Circle)clone();
		
		// 복사할 경우 원이 겹치지 않게 x,y 좌표를 이동
		circle.x  += 1;
		circle.y  += 1;
		
		return circle;
	}
}
