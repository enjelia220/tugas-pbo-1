import java.util.Scanner;

public class Tabung extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jari_jari;//Mendeklarasikan variabel jari_jari.

    Tabung(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai() {
        super.luasPermukaan();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();//untuk mendapatkan nilai dari input tanpa menggunakan objek scanner. Saya menggantinya dengan scanner.nextDouble() untuk memperoleh nilai input dari pengguna
        System.out.print("Input jari-jari: ");//saya menambahkan ;
        jari_jari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * Math.PI * jari_jari * (jari_jari);
        super.luasPermukaan();//Memperbaiki pemanggilan metode super.luasPermukaan() dengan menambahkan tanda kurung ()
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume() {
        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
