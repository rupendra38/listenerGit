import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.MyListeners;

//@Listeners(MyListeners.class)

public class Login {

	
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setup method called");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test 1 pass method");
	}
	@Test
	public void test2()
	{
		System.out.println("test 2 pass method");
		Assert.assertEquals(true, false);
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("test 3 failed method");


	}
	@Test
	public void test4()
	{
		System.out.println("test 4 failed method");
	}
}
