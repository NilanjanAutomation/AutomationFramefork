package testScript;

import org.testng.annotations.Test;

import utility.UtilityClass;

public class TC_001 extends UtilityClass
{
	@Test
	public void sample()
	{
		//screenShot();
		System.out.println(driver.getTitle());
	}

}
