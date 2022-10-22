package encp;
class Sample 
{ private int a=10;
public int getA()
{
	return a;
}
public void setA(int a)
{
	this.a=a;
}
}

public class encap1 
{
public static void main(String[] args)
{
	Sample s1=new Sample();
	int y=s1.getA();
	System.out.println(y);
	s1.setA(80);
	System.out.println(s1.getA());
}
}
