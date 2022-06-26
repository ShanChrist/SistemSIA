package Model;

public class MhsDoktor extends Mahasiswa {
    private String judulPenelitian;
    private int nSidang1;
    private int nSidang2;
    private int nSidang3;
    
    public MhsDoktor(String nama, String alamat, String ttl, String telepon, String nim, String jurusan,
            String judulPenelitian, int nSidang1, int nSidang2, int nSidang3) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulPenelitian = judulPenelitian;
        this.nSidang1 = nSidang1;
        this.nSidang2 = nSidang2;
        this.nSidang3 = nSidang3;
    }

    @Override
    public String toString() {
        return "MhsDoktor [judulPenelitian=" + judulPenelitian + ", nSidang1=" + nSidang1 + ", nSidang2=" + nSidang2
                + ", nSidang3=" + nSidang3 + "]";
    }

    public String getJudulPenelitian() {
        return judulPenelitian;
    }

    public void setJudulPenelitian(String judulPenelitian) {
        this.judulPenelitian = judulPenelitian;
    }

    public int getnSidang1() {
        return nSidang1;
    }

    public void setnSidang1(int nSidang1) {
        this.nSidang1 = nSidang1;
    }

    public int getnSidang2() {
        return nSidang2;
    }

    public void setnSidang2(int nSidang2) {
        this.nSidang2 = nSidang2;
    }

    public int getnSidang3() {
        return nSidang3;
    }

    public void setnSidang3(int nSidang3) {
        this.nSidang3 = nSidang3;
    }


    
}
