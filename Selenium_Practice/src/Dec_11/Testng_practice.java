package Dec_11;

import org.testng.annotations.*;

public class Testng_practice {
	@Test
	public void Test() {
		System.out.println("@Test");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("@BeforeTest");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("@AfterTest");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("@BeforeClass");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("@AfterClass");
	}
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("@BeforeSuite");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("@AfterSuite");
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("@AfterMethod");
	}
}
