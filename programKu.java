public class programKu {
    
    // Method untuk menampilkan angka dari 1 sampai i
    public static void TampilHinggaKei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
    }

    // Method untuk menjumlahkan dua bilangan
    public static int Jumlah(int bil1, int bil2) {
        return (bil1 + bil2);
    }

    // Method yang menggabungkan proses penjumlahan lalu menampilkannya
    public static void TampilJumlah(int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }

    // Main method (titik awal program berjalan)
    public static void main(String[] args) {
        int temp = Jumlah(1, 1); // temp akan bernilai 2
        TampilJumlah(temp, 5);   // memanggil fungsi dengan input (2, 5)
    }
}