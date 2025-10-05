package pbo.p6.materi;

public class TelevisiModern extends Televisi{
    private String modusTampilan;
    private String dvd;

    public TelevisiModern(String mrk, int jmlChannel){
        merek = mrk;
        jumlahChannel = jmlChannel;
    }

    public void gantiModusTampilan(String modus){
        modusTampilan = modus;
    }
    
    public void mainkanDVD(){
        System.out.print("Sedang memainkan DVD: ");
        if (dvd == null){
            System.out.println("Kosong");
        }
        else{
            System.out.println(dvd);
        }
    }

    public void masukkanDVD(String judulDVD){
        dvd = judulDVD;
    }
}
