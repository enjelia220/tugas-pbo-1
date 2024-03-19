import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);///menggunakan Scanner untuk menerima input dari pengguna
        int pilihan;

///saya menggunakan perulangan do-while untuk program untuk terus menampilkan menu pilihan hingga pengguna memilih untuk keluar (memilih pilihan 3)
        do {
            System.out.println("Pilih bangun ruang:");
            System.out.println("1. Kubus");
            System.out.println("2. Tabung");
            System.out.println("3. Keluar");
            System.out.print("pilihan Anda (1, 2, atau 3): ");
            pilihan = scanner.nextInt();

            if (pilihan == 1) {
                Kubus kubus = new Kubus("kubus");
                kubus.inputNilai();
                kubus.luasPermukaan();
                kubus.volume();
            } else if (pilihan == 2) {
                Tabung tabung = new Tabung("tabung");
                tabung.inputNilai();
                tabung.luasPermukaan();
                tabung.volume();
            } else if (pilihan != 3) {
                System.out.println("Pilihan tidak valid. Silakan masukkan 1 untuk Kubus, 2 untuk Tabung, atau 3 untuk Keluar.");
            }
        } while (pilihan != 3);
    }
}