import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double ar = 2.14, el = 3.67, dom = 1.11, muz = 0.95, pat = 5;
        double kg;
        double toplam = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kg? :");
        kg = inp.nextDouble();
        toplam += ar*kg;

        System.out.print("Elma kaç kg? :");
        kg = inp.nextDouble();
        toplam += el*kg;

        System.out.print("Domates kaç kg? :");
        kg = inp.nextDouble();
        toplam += dom*kg;

        System.out.print("Muz kaç kg? :");
        kg = inp.nextDouble();
        toplam += muz*kg;

        System.out.print("Patlıcan kaç kg? :");
        kg = inp.nextDouble();
        toplam += pat*kg;
        
        System.out.print("toplam :" + toplam + "TL");


        
    }
}
