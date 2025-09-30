package pbo.p4.tugas;

public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String info() {
        String info = "";
        info += "Kode MK    : " + this.kode + "\n";
        info += "Nama MK    : " + this.nama + "\n";
        info += "Jumlah SKS : " + this.sks + "\n";
        return info;
    }
}
