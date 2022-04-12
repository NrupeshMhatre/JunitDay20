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
	public boolean emailID(String teststring) {
		String regex="[a-z \\. a-z]+[@][a-z]+\\.[a-z]{3}+\\.[a-z]{2}";
		Pattern p=Pattern.compile(regex);
		Matcher mat=p.matcher(teststring);
		boolean result=mat.find();
		return result;
}
	public boolean mobileNumb(String teststring) {
		String regex="[0-9]{2} [98]{1}[0-9]{9}";
		Pattern p=Pattern.compile(regex);
		Matcher mat=p.matcher(teststring);
		boolean result=mat.find();
		return result;
}
}
