import java.util.Scanner;

public class Adim3 {

	public static void main(String[] args) {

		// vize1 %30.. vize2 %30.. final %40
		//geçme notu 60
		
		Scanner scanner= new Scanner(System.in);
	   
		System.out.println("Adýnýzý giriniz:");
	    String isim= scanner.nextLine();
	    
	    System.out.println("Soyadýnýzý giriniz:");
	    String soyisim= scanner.nextLine();
	    
	    System.out.println("Dersi giriniz:");
	    String ders= scanner.nextLine();
	    
	    System.out.println("Vize1 notunuzu giriniz:");
	    double vize1= scanner.nextDouble();
	    
	    System.out.println("Vize2 notunuzu giriniz:");
	     double vize2= scanner.nextDouble();
	    
	    System.out.println("Final notunuzu giriniz:");
	    double finalnotu= scanner.nextDouble();
	    
	    double sonuc= (vize1*0.3) + (vize2*0.3) + (finalnotu*0.4);
	    
	    if(sonuc>=60) {
	    System.out.println(isim+" "+soyisim+" adlý öðrenci "+ ders+" dersinden "+sonuc+" ortalamayla geçmiþtir.");
	    }
	    else {
			System.out.println("Dersten kaldýnýz :/");
		}
	    
	    
	    
	    
	
	
	}

}
