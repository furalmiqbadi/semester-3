package pbo.p4.tugas;

public class Dosen {
    private int nidn;
    private String nama;

    public Dosen(int nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String info() {
        String info = "";
        info += "NIDN       : " + this.nidn + "\n";
        info += "Nama       : " + this.nama + "\n";
        return info;
    }
}
