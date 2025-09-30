package pbo.p4.tugas;

public class Jadwal {
    private String hari;
    private String waktu;
    private MataKuliah mataKuliah;
    private Dosen dosen;
    private Ruangan ruangan;

    public Jadwal(String hari, String waktu, MataKuliah mataKuliah, Dosen dosen, Ruangan ruangan) {
        this.hari = hari;
        this.waktu = waktu;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.ruangan = ruangan;
    }

    public String info() {
        String info = "";
        info += "Hari/Waktu : " + hari + " / " + waktu + "\n";
        info += mataKuliah.info();
        info += dosen.info();
        info += ruangan.info();
        return info;
    }
}
