public class Kafe17nomor2 {

    public static void main(String[] args) {

        String namaPelanggan = "Bintang";
        boolean isMember = true;
        System.out.println("Selamat datang di Resto Kafe!");
        System.out.println("=== Menu Resto Kafe ===");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");

    
        if (isMember) {
            System.out.println("Anda mendapatkan diskon 10% sebagai member kami.");
        } else {
            System.out.println("Daftarkan diri Anda sebagai member untuk mendapatkan diskon 10% pada pembelian berikutnya.");
    }
        System.out.println("Selamat datang " + namaPelanggan + "!");

}
}
