package day32_varargs_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		// varargs once parametre kullanilabilir 
		
		
		topla(5,8,7,9,11,5,4);
	
	}
	private static void topla(int... sayilar) {
		
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
			
		
		}
		System.out.println("girilen sayialrin toplami===>" +toplam);

	}

}
