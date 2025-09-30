public class Roket {
    private String Tipe;
    private int Power;

    Roket(String tipe, int pwr) {
        Tipe = tipe;
        Power = pwr;
    }

    public String getTipe() {
        return Tipe;
    }

    public void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int Power) {
        this.Power = Power;
    }
}
