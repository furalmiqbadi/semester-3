package pbo.p4.tugas;

public class Ruangan {
    private String kode;
    private String nama;

    public Ruangan(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String info() {
        String info = "";
        info += "Kode Ruang : " + this.kode + "\n";
        info += "Nama Ruang : " + this.nama + "\n";
        return info;
    }
}
