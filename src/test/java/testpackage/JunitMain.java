package testpackage;

import java.util.Scanner;

import mainpackage.RegexPattern;

public class JunitMain {
	public static void main(String[] args) {
		RegexPattern p = new RegexPattern();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First-Name: ");
        String firstName = scanner.next();
       p.validateFirstName(firstName);
        System.out.println("Enter Last-Name: ");
        String lastName = scanner.next();
        p.validateLastName(lastName);
        System.out.println("Enter Email: ");
        String email = scanner.next();
        p.validateEmail(email);
        System.out.println("Enter Phone-Number");
        String number = scanner.next();
        p.validatePhoneNumber(number);
        System.out.println("Enter Password: ");
        String password = scanner.next();
        p.validatePassword(password);
        p.register();
}
}