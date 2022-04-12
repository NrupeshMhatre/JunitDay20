package testpackage;

import static org.junit.Assert.*;

import org.junit.Test;

import mainpackage.ClassMain;
import mainpackage.ClassMain;

public class TestClass {
	ClassMain m=new ClassMain();
	@Test
	public void Test() {
		boolean result =m.validname("Nrupesh");
		assertEquals(result,true);
	}
	@Test
	public void lastNAmeTest() {
		boolean result =m.lastname("Mhatre");
		assertEquals(result,true);	
}
	@Test
	public void emailIDTest() {
		boolean result =m.emailID("abc.xyz@bl.com.in");
		assertEquals(result,true);
}
	@Test
	public void mobileNumberTest() {
		boolean result =m.mobileNumb("91 9892247438");
		assertEquals(result,true);
}
	
}
