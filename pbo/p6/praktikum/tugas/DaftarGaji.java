package pbo.p6.praktikum.tugas;

class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
        index = 0;
    }

    public void addPegawai(Pegawai p) {
        if (index < listPegawai.length) {
            listPegawai[index] = p;
            index++;
        }
    }

    public void printSemuaGaji() {
        for (Pegawai p : listPegawai) {
            if (p != null) {
                System.out.println("Nama: " + p.getNama() + " Gaji: " + p.getGaji());
            }
        }
    }
}

