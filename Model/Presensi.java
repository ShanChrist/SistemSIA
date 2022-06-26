package Model;

public class Presensi implements Status{
    private String tanggal;
    private int status;
    
    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    @Override
    public String toString() {
        if(status == HADIR){
            return "\ntanggal=" + tanggal + "\nstatus= hadir";
        }else{
            return "\ntanggal=" + tanggal + "\nstatus= alpha";
        }
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
