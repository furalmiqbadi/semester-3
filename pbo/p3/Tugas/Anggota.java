package pbo.p3.Tugas;

public class Anggota {
    private String noKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String noKTP, String nama, double limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double jumlah) {
        if (jumlahPinjaman + jumlah <= limitPinjaman) {
            jumlahPinjaman += jumlah;
        } else {
            System.out.println("Maaf, jumlah melebihi limit.");
        }
    }

    public void angsur(double jumlah) {
        if (jumlah > 0) {
            double minimalAngsuran = 0.1 * jumlahPinjaman; // 10% dari sisa pinjaman
            if (jumlah < minimalAngsuran) {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
            } else if (jumlah <= jumlahPinjaman) {
                jumlahPinjaman -= jumlah;
            } else {
                System.out.println("Jumlah angsuran lebih besar dari pinjaman!");
            }
        }
    }
}
