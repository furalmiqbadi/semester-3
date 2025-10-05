package pbo.p6.materi;

public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi(){
        channelAktif = 1;
    }

    public void pindahChannel (int channelBaru){
        channelAktif = channelBaru;
    }

    public int getChannelAktif() {
        return channelAktif;
    }

}
