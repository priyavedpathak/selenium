package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCasesGroup {
	
	@Test(groups= {"Sanity","Smoke"})
	@Parameters({"user, password"})
     public void test1(String user,String pass)
     {
		System.out.println(user+" "+pass);
		System.out.println("sanity,smoke");
     }
	@Test(groups= {"Sanity"})
    public void test2()
    {
		System.out.println("sanity");
    }
	@Test(groups= {"Smoke"})
    public void test3()
    {
		System.out.println("smoke");
    }
}
