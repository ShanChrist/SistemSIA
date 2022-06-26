package Model;

import java.util.ArrayList;

public class DosenTetap extends Dosen{
    private double salary;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, String nik, String departemen,
            ArrayList<MatkulAjar> listMatkulAjar, int salary) {
        super(nama, alamat, ttl, telepon, nik, departemen, listMatkulAjar);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "DosenTetap [salary=" + salary + "]";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}
