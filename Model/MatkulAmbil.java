package Model;
import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah matkulAmbil;
    private ArrayList <Presensi> listPresensi;
    private int n1;
    private int n2;
    private int n3;
    
    public MatkulAmbil(MataKuliah matkulAmbil, ArrayList<Presensi> listPresensi, int n1, int n2, int n3) {
        this.matkulAmbil = matkulAmbil;
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MatkulAmbil [listPresensi=" + listPresensi + ", matkulAmbil=" + matkulAmbil + ", n1=" + n1 + ", n2="
                + n2 + ", n3=" + n3 + "]";
    }

    public MataKuliah getMatkulAmbil() {
        return matkulAmbil;
    }

    public void setMatkulAmbil(MataKuliah matkulAmbil) {
        this.matkulAmbil = matkulAmbil;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
    
}
