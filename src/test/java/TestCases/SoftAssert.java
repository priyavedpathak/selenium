package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SoftAssert {
	
	org.testng.asserts.SoftAssert assert1 ;
	@Test
	public void testAssertions()
	{
		int i=10;
		assert1 = new org.testng.asserts.SoftAssert();
		assert1.assertEquals(i, 20);
		assert1.assertNotEquals(10,20);
		System.out.println("this s test case 1");
		
	}

	@Test
	public void testAssertions1()
	{
		int j=20;
		assert1.assertTrue(j==10);
		assert1.assertFalse(false);
		System.out.println("this is test case 2");
	}
	
	@AfterClass
	public void tesrdown() {
		assert1.assertAll();
	}
	
	
	}




