package demo;

public class SubClass extends SuperClass {

	public SubClass()
	{
		System.out.println("child class default construct called.");
	}
	
	public void method1(int a)
	{
		System.out.println("to check int a of subclass ");
	}
	
	public void method2()
	{
		System.out.println("to check method2 of subclass");
	}
}
