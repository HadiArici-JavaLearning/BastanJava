package day32_varargs_stringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		// 
		
		KafanaGoreTopla(5,8,7,9,11,5,4);
	
	}
		private static void KafanaGoreTopla(int sayi1, int sayi2, int... sayilar) {
		
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
			
		
		}
		System.out.println("girilen sayialrin toplami===>" +sayi1*toplam);
	}
	}

	

