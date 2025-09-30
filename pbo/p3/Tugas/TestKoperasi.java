package pbo.p3.Tugas;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman: "); double pinjam = sc.nextDouble();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran: "); double angsur = sc.nextDouble();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        sc.close();
    }
}

