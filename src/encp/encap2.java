package encp;
class Icici_bank
{ 
private int atmpin=12334;
public int getAtmpin()
{
	return atmpin;
}
public void setAtmpin(int atmpin)
{
	this.atmpin=atmpin;
}
}
public class encap2 
{
public static void main(String[] args)
{
Icici_bank atmcard=new Icici_bank();
	int y=atmcard.getAtmpin();
	System.out.println(y);
	atmcard.setAtmpin(24355);
	System.out.println(atmcard.getAtmpin());
}
}

