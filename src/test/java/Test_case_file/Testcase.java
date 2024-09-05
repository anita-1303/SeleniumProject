package Test_case_file;

import org.testng.annotations.Test;

import Page_object_file.loggingclass;

public class Testcase extends Baseclass

{
	@Test
	void test()
	{
		driver.get(url);
		loggingclass lc = new loggingclass(driver);
		lc.username("student");
		lc.password ("Password123");
		lc.submit();
	}

}
