
import java.util.Scanner;
public class Kafe17 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {


        System.out.println("=== Menu Resto Kafe ===");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");

                System.out.println("Selamat datang " + namaPelanggan + "!");
        if ("DISKON50".equalsIgnoreCase(kodePromo)) {
            System.out.println("DISKON 50% BERHASIL DIGUNAKAN!");
        } else if ("DISKON30".equalsIgnoreCase(kodePromo)) {
            System.out.println("DISKON 30% BERHASIL DIGUNAKAN!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }



        if (isMember) {
            System.out.println("Anda adalah member");
        } else {
            System.out.println("Daftarkan diri Anda.");
        }
    }

    public static int hitungTotalHarga17(int pilihanMenu, int banyakItem) {
    int[] hargaitems = {15000, 20000, 22000, 12000, 10000, 18000};
    int hargaTotal = hargaitems [pilihanMenu - 1] * banyakItem;
    return hargaTotal;
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodePromo = "DISKON50";
        Menu("Andi", true, kodePromo);

        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan pilihan menu (1-6, 0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break; // keluar dari loop
            }

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga17(pilihanMenu, banyakItem);
            totalKeseluruhan += totalHarga;

            System.out.println("Subtotal pesanan ini: Rp " + totalHarga);
        }


// Hitung diskon
        int totalSetelahDiskon = totalKeseluruhan;

        if ("DISKON50".equalsIgnoreCase(kodePromo)) {
            totalSetelahDiskon = totalKeseluruhan - (totalKeseluruhan * 50 / 100);
        } else if ("DISKON30".equalsIgnoreCase(kodePromo)) {
            totalSetelahDiskon = totalKeseluruhan - (totalKeseluruhan * 30 / 100);
        }

// Tampilkan harga setelah diskon
System.out.println("Total harga setelah diskon: Rp " + totalSetelahDiskon);

    }
}
