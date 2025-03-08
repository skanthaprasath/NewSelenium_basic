package secondTestng;

import org.testng.annotations.*;

public class c2 {
	@BeforeSuite
	void bs()
	{
		System.out.println("beforesuite");
	}
	@AfterSuite
	void as()
	{
		System.out.println("aftersuite");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("beforetest");
	}	
	@AfterTest
	void at()
	{
		System.out.println("aftertest");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("beforeclasses");
	}
	@AfterClass
	void ac()
	{
		System.out.println("afterclasses");
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("beforemethod");
	}
	@AfterMethod
	void am()
	{
		System.out.println("aftermehod");
	}
	@Test
	void test1()
	{
		System.out.println("test print 1");
	}
	@Test
	void test2()
	{
		System.out.println("test print 2");
	}
	

}
