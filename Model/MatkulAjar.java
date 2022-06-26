package Model;
import java.util.ArrayList;

public class MatkulAjar {
    private MataKuliah matkulAjar;
    private ArrayList <PresensiStaff> presensi;
    
    public MatkulAjar(MataKuliah matkulAjar, ArrayList<PresensiStaff> presensi) {
        this.matkulAjar = matkulAjar;
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        return "MatkulAjar [matkulAjar=" + matkulAjar + ", presensi=" + presensi + "]";
    }

    public MataKuliah getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(MataKuliah matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }

    
}
