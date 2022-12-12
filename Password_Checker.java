/**
 * @author Sabbyasachi Majumder
 */

import java.util.*;
import java.util.regex.*;

public class Password_Checker {
	
	/* Rules for a perfect password :
	 * 1. Password to be checked : User Provided
	 * 2. At least 1 Upper Case letter
	 * 3. At least 1 Lower Case letter
	 * 4. At least 1 Digit 
	 * 5. At least 1 Symbol
	 */	
	public boolean check(String key) {
		
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[!@#$%^&*])" + "(?=\\S+$).{8,20}$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(key);
        return m.matches();		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Password_Checker obj = new Password_Checker();
		System.out.println("\t\tCheck Your Password : \n");
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		String s="";
		do{
			System.out.print("\nHey! "+name+" , enter the password you need to check (atleast more than 3 characters) : ");
			s=sc.next();
		}while(s.length()<4);
		if(obj.check(s))
			System.out.print("\nHey! "+name+" your password is correct");
		else
			System.out.print("\nHey! "+name+" your password is not correct");

	}

}
