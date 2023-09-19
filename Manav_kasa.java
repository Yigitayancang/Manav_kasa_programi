// kullanıcı girişi için kütüphane eklenimi
import java.util.Scanner;
public class Manav_kasa {
        public static void main(String[] args) {
            
            // verilerin tutulması için double ve int türündeki veri tipi eklenimi
            double armut = 2.14 , elma=3.67 , domates=1.11 , muz=0.95, patlıcan=5.00;
            int armutkg , elmakg , domateskg , muzkg, patlıcankg;
            double toplam1 , toplam2 , toplam3 , toplam4, toplam5 , anatoplam;
            // kullanıcıdan veri alma
            Scanner giris = new Scanner(System.in);
            // operatörler sayesinde alınan verilerin hesaplanması 
            System.out.print("ARMUT KAÇ KİLO : ");
            armutkg = giris.nextInt();
            toplam1 = armut * armutkg;
            System.out.print("ELMA KAÇ KİLO  : ");
            elmakg = giris.nextInt();
            toplam2 = elma * elmakg;
            System.out.print("DOMATES KAÇ KİLO : ");
            domateskg = giris.nextInt();
            toplam3 = domates* domateskg;
            System.out.print("MUZ KAÇ KİLO : ");
            muzkg = giris.nextInt();
            toplam4 = muz * muzkg;
            System.out.print("PATLICAN KAÇ KİLO : ");
            patlıcankg = giris.nextInt();
            toplam5 = patlıcan * patlıcankg;
            // alınan verilerin toplanımı     
            anatoplam = toplam1 + toplam2 + toplam3 + toplam4 + toplam5;
            // ekrana bastırımı 
            System.out.println("ÖDENECEK TUTAR : " + anatoplam + " TL ");

            
            




            

            

        }
    
}