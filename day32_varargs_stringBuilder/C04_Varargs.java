package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KafanaGoreIslem(5,8,5,0);
		// varargs in elamam sayisi hic elaman olmasada java itiraz etmez once int olan sayialr esletirir
		// kalan tu7m sayialri varargs doldurur
	}
		private static void KafanaGoreIslem(int sayi1, int sayi2, int sayi3, int sayi4, int...sayilar) {
			
			int toplam=0;
			for (int each : sayilar) {
				toplam+=each;
				
			
			}
			System.out.println("girilen sayialrin toplami===>" +(sayi1*toplam));
		}
	


}
