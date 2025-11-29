import java.util.Scanner;
public class HitungBalok17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.print("Masukkan panjang balok: ");
        p=sc.nextInt();

        System.out.print("Masukkan lebar balok: ");
        l=sc.nextInt();

        System.out.print("Masukkan tinggi balok: ");
          t=sc.nextInt();

      L = p * l;
      System.out.println("Luas Balok: " + L);
      vol = p * l * t;
        System.out.println("Volume Balok: " + vol);

        
    }
}
