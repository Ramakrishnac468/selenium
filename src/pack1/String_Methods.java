package pack1;

public class String_Methods {
	
public static void main(String[] args) {
		
		String str1="Navya Sri";
		String str2="Ram";
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat("xyz"));
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str1.length());
		System.out.println(str1.equals(str2));
		System.out.println(str1.charAt(4));
		System.out.println(str1.contains("Sri"));
		System.out.println(str1.indexOf('y'));
		System.out.println(str1.substring(3, 8));
		System.out.println(str1.substring(6));
		
	}

}
