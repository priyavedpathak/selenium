package TestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestCases.ListenerInTestng.class)
public class ListenerUsage {

	
	@Test
	public void test() {
		
	}
}
