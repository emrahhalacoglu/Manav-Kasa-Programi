import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Kaç KG Armut Alindi? : ");
            double armutKG=input.nextDouble();
            System.out.print("Kaç KG Elma Alindi? : ");
            double elmaKG=input.nextDouble();
            System.out.print("Kaç KG Domates Alindi? : ");
            double domatesKG=input.nextDouble();
            System.out.print("Kaç KG Muz Alindi? : ");
            double muzKG=input.nextDouble();
            System.out.print("Kaç KG Patlican Alindi? : ");
            double patlicanKG=input.nextDouble();
            double toplamTutar=armut*armutKG+elma*elmaKG+domates*domatesKG+muz*muzKG+patlican*patlicanKG;
            System.out.println("Toplam Tutar : "+toplamTutar );
        }

    }
}
