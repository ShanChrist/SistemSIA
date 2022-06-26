package Model;

public class MatkulPilihan extends MataKuliah {
    private int jumlahMin;

    public MatkulPilihan(String kode, String sks, String nama, int jumlahMin) {
        super(kode, sks, nama);
        this.jumlahMin = jumlahMin;
    }

    @Override
    public String toString() {
        return "MatkulPilihan [jumlahMin=" + jumlahMin + "]";
    }

    public int getJumlahMin() {
        return jumlahMin;
    }

    public void setJumlahMin(int jumlahMin) {
        this.jumlahMin = jumlahMin;
    }
    
}
