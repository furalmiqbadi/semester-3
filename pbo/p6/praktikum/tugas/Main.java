package pbo.p6.praktikum.tugas;

public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("001", "Budi", "Jakarta");
        d1.setSKS(10);

        Dosen d2 = new Dosen("002", "Ani", "Bandung");
        d2.setSKS(8);

        DaftarGaji daftar = new DaftarGaji(5);
        daftar.addPegawai(d1);
        daftar.addPegawai(d2);

        daftar.printSemuaGaji();
    }
}
