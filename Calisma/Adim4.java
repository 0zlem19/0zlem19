
public class Adim4 {

	public static void main(String[] args) {

		/*
		 Bir kuruyemi�ci toptanc�dan;
		 12 kilo leblebiyi kilosunu 3.5 tl
		 25 kilo f�nd��� kilosunu 15.7 tl
		 40 kilo bademi kilosunu 22 tl den alm��t�r.
		 
		 bu �r�nleri satarken,
		 ---> leblebinin kilosunu %50 fazlas�na
		 ---> f�nd���n %40 fazlas�na
		 ---> bademi %60 fazlas�na satm��t�r.
		 
		 kuruyemi�ci o g�nk� kazand��� para ile kiras�n� �demek istemektedir.
		 kira tutar�:500 tl
		 kazand��� para 500tlden b�y�k ise kiras�n� �deyebilsin de�ilse �deyemesin.
		 */
		
		double leblebi= 3.5;
		double findik= 15.7;
		double badem= 22;
		
		double maliyet= ((leblebi*12)+(findik*25)+(badem*40));
		double satis= ((leblebi*1.5)*12) + ((findik*1.4)*25) + ((badem*1.6)*40);
		double kar= satis- maliyet;
		
		if (kar>500) {
		System.out.println("kiray� �deyebilirsin :)");
		}
		else {
		System.out.println("kiray� �deyemezsin para yeterli de�il :(");	
		}

		System.out.println("Maliyet :"+ maliyet);
	    System.out.println("Sat��:"+ satis);
	    System.out.println("Kazan�:"+ kar);
		
	}
}
