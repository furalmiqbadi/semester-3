public class SpaceShuttle {
    private String Kode;
    private int Berat;
    private Roket RoketUtama;
    private Generator GeneratorUtama;

    SpaceShuttle(String kd, int brt, Roket rkt, Generator gnt) {
        Kode = kd;
        Berat = brt;
        RoketUtama = rkt;
        GeneratorUtama = gnt;
    }

    public String getKode() {
        return Kode;
    }
    
    public void setKode(String Kode) {
        this.Kode = Kode;
    }

    public int getBerat() {
        return Berat;
    }
    
    public void setBerat(int Berat) {
        this.Berat = Berat;
    }

    public Roket getRoketUtama() {
        return RoketUtama;
    }

    public void setRoketUtama(Roket RoketUtama) {
        this.RoketUtama = RoketUtama;
    }

    public Generator getGeneratorUtama() {
        return GeneratorUtama;
    }

    public void setGeneratorUtama(Generator GeneratorUtama) {
        this.GeneratorUtama = GeneratorUtama;
    }

}
