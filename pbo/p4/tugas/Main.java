package pbo.p4.tugas;

public class Main {
    public static void main(String[] args) {
        Dosen dosenPBO = new Dosen(111, "Budi Raharjo");
        Dosen dosenJarkom = new Dosen(222, "Citra Dewi");
        
        Ruangan ruang701 = new Ruangan("701", "Lab Jaringan");
        Ruangan ruang705 = new Ruangan("705", "Lab Pemrograman");
        
        MataKuliah pbo = new MataKuliah("PBO-01", "Pemrograman Berorientasi Objek", 3);
        MataKuliah jarkom = new MataKuliah("JK-02", "Jaringan Komputer", 3);

        Jadwal jadwalPBO = new Jadwal("Senin", "08:00 - 10:30", pbo, dosenPBO, ruang705);
        Jadwal jadwalJarkom = new Jadwal("Rabu", "10:30 - 13:00", jarkom, dosenJarkom, ruang701);
        
        Mahasiswa mhs1 = new Mahasiswa(2340001, "Ahmad", 5);
        mhs1.tambahJadwal(jadwalPBO);
        mhs1.tambahJadwal(jadwalJarkom);

        System.out.println(mhs1.info());
    }
}
