public class Generator {
    private int Daya;
    private int Voltase;

    Generator(int dy, int volt) {
        Daya = dy;
        Voltase = volt;
    }

    public int getDaya() {
        return Daya;
    }

    public void setDaya(int Daya) {
        this.Daya = Daya;
    }

    public int getVoltase() {
        return Voltase;
    }

    public void setVoltase(int Voltase) {
        this.Voltase = Voltase;
    }
}
