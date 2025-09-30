package pbo.p4.tugas;

public class Mahasiswa {
    private int nim;
    private String nama;
    private Jadwal[] daftarJadwal;
    private int jumlahJadwal;

    public Mahasiswa(int nim, String nama, int maxJadwal) {
        this.nim = nim;
        this.nama = nama;
        this.daftarJadwal = new Jadwal[maxJadwal];
        this.jumlahJadwal = 0;
    }

    public void tambahJadwal(Jadwal jadwal) {
        if (jumlahJadwal < daftarJadwal.length) {
            daftarJadwal[jumlahJadwal] = jadwal;
            jumlahJadwal++;
        }
    }

    public String info() {
        String info = "";
        info += "=========================================\n";
        info += "               JADWAL KULIAH\n";
        info += "=========================================\n";
        info += "NIM        : " + nim + "\n";
        info += "Nama       : " + nama + "\n";
        info += "=========================================\n";

        for (int i = 0; i < jumlahJadwal; i++) {
            info += daftarJadwal[i].info() + "\n";
        }
        return info;
    }
}
