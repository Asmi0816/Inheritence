package inheritence.model;

public class ThirdThing extends SubThing implements OtherInterface
{
	public int [] stackOfNumber()
	{
		int [] stuffInside = {1,2,3,4,4,5,6,7,8,8,9};
		return stuffInside;
	}
	public void uselessMethod()
	{
		
	}
	public void otherUselessPeiceOJunkLongNamedMethod(double thisPleas)
	{
		
	}
	public void doesNada()
	{
		System.out.println("777777777777777 sunday!");
		super.doesNada();
	}
	public void doesOtNada()
	{
		
	}
	public int countsNada(int someValue)
	{
		return someValue;
	}
}
