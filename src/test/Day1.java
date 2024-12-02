package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@AfterTest
	public void lastexecution() {
		System.out.println("i will be execute last");
	}

	@Test
	public void demo() {
		System.out.println("hello");
	}
@AfterSuite
public void afsuite()
{
	System.out.println("i am the no 1 from last");
}
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}
}
