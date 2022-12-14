/**
 * @author Sabbyasachi Majumder
 */

import java.util.*;

public class Password_Generator {
	
	/* Rules for a perfect password :
	 * 1. Total length : User provided
	 * 2. At least 1 Upper Case letter
	 * 3. At least 1 Lower Case letter
	 * 4. At least 1 Digit 
	 * 5. At least 1 Symbol
	 */
	public char getRandom(char[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	
	public String gen(int len) {
		String key="";
		char a[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char n[]= {'0','1','2','3','4','5','6','7','8','9'};
		char s[]= {'!','@','#','$','%','^','&','*'};
		char all[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','!','@','#','$','%','^','&','*'};

		key=""+getRandom(a)+getRandom(s)+Character.toUpperCase(getRandom(a))+getRandom(n);
		
		for(int k=3 ; k<len ; k++)
		{
			key+=""+getRandom(all);
		}
		return key;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Password_Generator obj = new Password_Generator();
		System.out.println("\t\tGenerate Your Password : \n");
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		int len=0;
		do{
			System.out.print("\nHey! "+name+" , enter the length of the password you need (atleast more than 3 characters) : ");
			len=sc.nextInt();
		}while(len<4);
		System.out.print("\nHey! "+name+" your password is : "+obj.gen(len));

	}

}
