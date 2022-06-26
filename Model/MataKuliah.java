package Model;

public class MataKuliah {
    private String kode;
    private String sks;
    private String nama;
    
    public MataKuliah(String kode, String sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "MataKuliah [kode=" + kode + ", nama=" + nama + ", sks=" + sks + "]";
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
