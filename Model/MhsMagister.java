package Model;

import java.util.ArrayList;

public class MhsMagister extends MhsSarjana{
    private String judulTesis;

    public MhsMagister(String nama, String alamat, String ttl, String telepon, String nim, String jurusan,
            ArrayList<MatkulAmbil> listMatkul, String judulTesis) {
        super(nama, alamat, ttl, telepon, nim, jurusan, listMatkul);
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return "MhsMagister [judulTesis=" + judulTesis + "]";
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }
}
