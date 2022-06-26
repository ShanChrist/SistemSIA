package Model;
import java.util.ArrayList;

public class MhsSarjana extends Mahasiswa {
    private ArrayList <MatkulAmbil> listMatkul;

    public MhsSarjana(String nama, String alamat, String ttl, String telepon, String nim, String jurusan,
            ArrayList<MatkulAmbil> listMatkul) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.listMatkul = listMatkul;
    }

    @Override
    public String toString() {
        return "MhsSarjana [listMatkul=" + listMatkul + "]";
    }

    public ArrayList<MatkulAmbil> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<MatkulAmbil> listMatkul) {
        this.listMatkul = listMatkul;
    }

}
