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
	
	public void lastNAmeTest() {
		boolean result =m.validname("Mhatre");
		assertEquals(result,true);	
}
	public void emailIDTest() {
		boolean result =m.validname("abc.xyz@bl.com.in");
		assertEquals(result,true);
}
}