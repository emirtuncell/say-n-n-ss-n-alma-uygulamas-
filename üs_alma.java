package üs_alma;

import java.util.Scanner;

public class üs_alma {
       public static void main(String[] args) {
		
    	   int ilk_sayi,sayi,alınacak_üs;
    	   Scanner scan=new Scanner(System.in);
    	   
    	   System.out.println(" ÜSSÜ ALINACAK SAYI:  ");
    	   ilk_sayi=scan.nextInt();//üssü alınacak sayı
    	   
    	   System.out.println("KAÇINCI ÜSSÜ ALINACAK?  ");
    	   alınacak_üs=scan.nextInt();//alınması istenen üs
    	   
    	   sayi=ilk_sayi*ilk_sayi;//burada fazladan bir değişken oluşturup istenen sayının karesine atadım.
    	   
    	   for(int i=2; i<=alınacak_üs; i++) {
    		   sayi*=ilk_sayi;//burada da istenen sayının karesini tekrar sayı ile çarparak üsleri bulmaya başladım.
    		   
    		   
    	   }
    	   if( alınacak_üs == 0) {
    			   System.out.println("SONUÇ = 1");
    			   
    		   }else {
    	   System.out.println("SONUÇ=  "+sayi/ilk_sayi);//her seferinde bir kere fazladan üs aldığı için ilk baştaki 
    	   //sayıya bir kere bölerek alınmasını istediğimiz üs sayısı kadar üs almış olduk.
    		   }
	}
}
