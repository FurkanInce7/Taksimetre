import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm=2.20;

        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen Gidilen Mesafeyi Girin: ");
        km= input.nextInt();
        double sonuc= (km*perKm)+10;
        sonuc= (sonuc < 20) ? 20 : sonuc;
        System.out.println("Odenmesi Gereken Ucret: "+sonuc);

    }

}

