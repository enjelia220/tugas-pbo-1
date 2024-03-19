import java.util.Scanner;

public class Kubus extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double sisi;

    @Override
    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input sisi: ");//Dalam metode input(), codingan awal menggunakan System.o() yang tidak valid. Ini seharusnya menjadi System.out.println()
        sisi = scanner.nextDouble();//Kesalahan dalam Menerima Input: codingan awal menggunakan scanner.nextnext() yang tidak valid. Ini seharusnya menjadi scanner.nextDouble() untuk menerima input bilangan desimal.
    }

    @Override
    public void luasPermukaan() {
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan(); //codingan awal memanggil metode super.luasaan() dan super.volume(), yang tidak ada dalam kelas BangunRuang. Ini harus disesuaikan dengan metode yang benar, yaitu super.luasPermukaan() dan super.volume()
        System.out.println("Hasil luas permukaan: " + hasil);//menambahkan tipe data 'system'
    }

    @Override
    public void volume() {
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);//Variabel hasil yang digunakan dalam metode volume() tidak dideklarasikan sebelumnya. dan harus mendeklarasikan variabel hasil dengan tipe data yang sesuai sebelum menggunakannya.
    }
}
