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

}
