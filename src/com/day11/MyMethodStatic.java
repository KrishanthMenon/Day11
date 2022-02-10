package com.day11;

interface MethInterface
{
	abstract public void meth();
	
	default public void show()
	{
		System.out.println("Hello show");
	}
	
	default public void print()
	{
		System.out.println("Hello print");
	}
}
class MethodClass implements MethInterface
{

	@Override
	public void meth() {
		// TODO Auto-generated method stub
		
	}

}


public class MyMethodStatic 
{
	public static void main(String args[])
	{
		MethodClass method=new MethodClass();
		method.show();
		method.print();	
		
		/*MethInterface interface1 = new MethInterface()
		{
			@Override
			public void meth() {
				// TODO Auto-generated method stub
				System.out.println("interface");
			}
		
		};
		interface1.show();
		interface1.print();*/
	}
}
