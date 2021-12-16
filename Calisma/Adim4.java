
public class Adim4 {

	public static void main(String[] args) {

		/*
		 Bir kuruyemişci toptancıdan;
		 12 kilo leblebiyi kilosunu 3.5 tl
		 25 kilo fındığı kilosunu 15.7 tl
		 40 kilo bademi kilosunu 22 tl den almıştır.
		 
		 bu ürünleri satarken,
		 ---> leblebinin kilosunu %50 fazlasına
		 ---> fındığın %40 fazlasına
		 ---> bademi %60 fazlasına satmıştır.
		 
		 kuruyemişci o günkü kazandığı para ile kirasını ödemek istemektedir.
		 kira tutarı:500 tl
		 kazandığı para 500tlden büyük ise kirasını ödeyebilsin değilse ödeyemesin.
		 */
		
		double leblebi= 3.5;
		double findik= 15.7;
		double badem= 22;
		
		double maliyet= ((leblebi*12)+(findik*25)+(badem*40));
		double satis= ((leblebi*1.5)*12) + ((findik*1.4)*25) + ((badem*1.6)*40);
		double kar= satis- maliyet;
		
		if (kar>500) {
		System.out.println("kirayı ödeyebilirsin :)");
		}
		else {
		System.out.println("kirayı ödeyemezsin para yeterli değil :(");	
		}

		System.out.println("Maliyet :"+ maliyet);
	    System.out.println("Satış:"+ satis);
	    System.out.println("Kazanç:"+ kar);
		
	}
}
