package testpackage;

import static org.junit.Assert.*;

import org.junit.Test;

import mainpackage.ClassMain;
//import mainpackage.ClassMain;

public class TestClass {
	ClassMain m=new ClassMain();
	@Test
	public void Test() {
		boolean result1 =m.validname("Nrupesh");
		assertEquals(result1,true);
	}
	@Test
	public void lastNAmeTest() {
		boolean result2 =m.lastname("Mhatre");
		assertEquals(result2,true);	
}
	@Test
	public void emailIDTest() {
		boolean result3 =m.emailID("abc.xyz@bl.com.in");
		assertEquals(result3,true);
}
	@Test
	public void mobileNumberTest() {
		boolean result4 =m.mobileNumb("91 9892247438");
		assertEquals(result4,true);
}
	@Test
	public void passwordRule1Test() {
		boolean result5 =m.passwodRule1("nrupeshmhatre");
		assertEquals(result5,true);	
}
}