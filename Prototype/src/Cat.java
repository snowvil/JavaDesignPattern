
public class Cat implements Cloneable
{
	private String name;
	private Age age;
	
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(Age age)
	{
		this.age = age;
	}
	
	public Age getAge()
	{
		return age;
	}
	
	
	
	@Override
	protected Cat clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		Cat copy = (Cat)super.clone();
		
		// class object deep copy
		copy.setAge( new Age( this.getAge().getYear(), this.getAge().getValue() ));
		
		return copy;
	}
}
