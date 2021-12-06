package day32_varargs_stringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
		String str = "Ali Can";
		String str2 = new String("Veli Can");
		
		// StringBuilder sb = "Yasasin Jav";
		StringBuilder sb1 = new StringBuilder("Yasasin Jav");
		
		sb1.append("!!!");
		System.out.println(sb1);
		String sb1buyukharf= sb1.toString().toUpperCase();
		System.out.println(sb1);
	
	}

}
