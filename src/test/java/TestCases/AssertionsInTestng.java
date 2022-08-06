package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInTestng {
	
	@Test
	public void testAssertions()
	{
		int i=10;
		
		Assert.assertEquals(i, 20);
		Assert.assertNotEquals(10,20);
		System.out.println("this s test case 1");
		
	}

	@Test
	public void testAssertions1()
	{
		int j=20;
		Assert.assertTrue(j==10);
		Assert.assertFalse(false);
		System.out.println("this is test case 2");
	}
}
