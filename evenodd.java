package pack;
public class evenodd
{
String num;
	public String find()
	{
	int x=Integer.parseInt(num);
	if(x%2 == 0)
	return "Even";
	else
	return "Odd";
	}
	public void setNum(String num)
	{
	this.num=num;
	}
}