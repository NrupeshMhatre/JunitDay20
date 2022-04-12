package mainpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassMain {
	public boolean validname(String teststring) {
		String regex="[A-Z][a-z]*";
		Pattern p=Pattern.compile(regex);
		Matcher mat=p.matcher(teststring);
		boolean result=mat.find();
		return result;
	}	
	public boolean lastname(String teststring) {
		String regex="[A-Z][a-z]*";
		Pattern p=Pattern.compile(regex);
		Matcher mat=p.matcher(teststring);
		boolean result=mat.find();
		return result;
}
}
