package Model;
import java.util.ArrayList;

public class Dosen extends Staff{
    private String departemen;
    private ArrayList <MatkulAjar> listMatkulAjar;
    
    public Dosen(String nama, String alamat, String ttl, String telepon, String nik, String departemen,
            ArrayList<MatkulAjar> listMatkulAjar) {
        super(nama, alamat, ttl, telepon, nik);
        this.departemen = departemen;
        this.listMatkulAjar = listMatkulAjar;
    }

    @Override
    public String toString() {
        return "Dosen [departemen=" + departemen + ", listMatkulAjar=" + listMatkulAjar + "]";
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMatkulAjar() {
        return listMatkulAjar;
    }

    public void setListMatkulAjar(ArrayList<MatkulAjar> listMatkulAjar) {
        this.listMatkulAjar = listMatkulAjar;
    }


}
