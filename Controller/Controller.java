package Controller;

import java.util.ArrayList;
import Model.*;

public class Controller implements Status {
    ArrayList<User> listUser = new ArrayList<>();

    public Controller() {
        // inisialisasi mata kuliah
        MataKuliah mk1 = new MataKuliah("MK1", "3", "PemrogramanWeb");
        // MataKuliah mk2 = new MataKuliah("MK2", "3", "Web Desain");
        // MataKuliah mk3 = new MataKuliah("MK3", "3", "PBO");
        // MataKuliah mk4 = new MataKuliah("MK4", "3", "PrakPBO");

        // inisialisasi Mhs Sarjana
        Presensi p1 = new Presensi("12/12/2022", 1);
        Presensi p2 = new Presensi("12/12/2022", 1);
        Presensi p3 = new Presensi("12/12/2022", 0);
        ArrayList<Presensi> listPresensi1 = new ArrayList<>();
        listPresensi1.add(p1);
        listPresensi1.add(p2);
        listPresensi1.add(p3);
        MatkulAmbil m1 = new MatkulAmbil(mk1, listPresensi1, 100, 100, 100);
        ArrayList<MatkulAmbil> ambilMK1 = new ArrayList<>();
        ambilMK1.add(m1);
        MhsSarjana mhs1 = new MhsSarjana("Udin", "Jl. Raya", "12/12/2000", "0812121212", "123456789", "Sarjana",
                ambilMK1);

        // inisialisasi dosen tetap
        PresensiStaff pStaff1 = new PresensiStaff("12/12/2022", 1, 4);
        PresensiStaff pStaff2 = new PresensiStaff("12/12/2022", 1, 3);
        PresensiStaff pStaff3 = new PresensiStaff("12/12/2022", 0, 2);
        ArrayList<PresensiStaff> listPresensi2 = new ArrayList<>();
        listPresensi2.add(pStaff1);
        listPresensi2.add(pStaff2);
        listPresensi2.add(pStaff3);
        MatkulAjar mkAjar1 = new MatkulAjar(mk1, listPresensi2);
        ArrayList<MatkulAjar> mkAjar = new ArrayList<>();
        mkAjar.add(mkAjar1);
        DosenTetap dosen1 = new DosenTetap("Budi", "Jl. Raya", "12/12/2000", "0812121212", "123456789", "Informatika",
                mkAjar, 200000);

        // Masukan data
        listUser.add(mhs1);
        listUser.add(dosen1);
    }

    public int cekUserData(String nama) {
        for (int i = 0; i < listUser.size(); i++) {
            User temp = listUser.get(i);
            if (temp.getNama().equals(nama)) {
                return i;
            }
        }
        return -1;

    }

    public String printUserData(String nama) {
        int ketemu = cekUserData(nama);
        if (ketemu == -1) {
            return "Data tidak ditemukan";
        } else {
            String userData = "Nama : " + listUser.get(ketemu).getNama() + "\n" +
                    "Alamat : " + listUser.get(ketemu).getAlamat() + "\n" +
                    "TTL : " + listUser.get(ketemu).getTtl() + "\n" +
                    "Telepon : " + listUser.get(ketemu).getTelepon() + "\n";

            for (int i = 0; i < listUser.size(); i++) {
                if (listUser.get(ketemu) instanceof MhsSarjana) {
                    userData += "Status : Mahasiswa Sarjana\n";
                } else if (listUser.get(ketemu) instanceof MhsMagister) {
                    userData += "Status : Mahasiswa Magister\n";
                } else if (listUser.get(ketemu) instanceof MhsDoktor) {
                    userData += "Status : Mahasiswa Doktor\n";
                } else if (listUser.get(ketemu) instanceof DosenTetap) {
                    userData += "Status : Dosen Tetap\n";
                } else if (listUser.get(ketemu) instanceof DosenHonorer) {
                    userData += "Status : Dosen Honorer\n";
                } else if (listUser.get(ketemu) instanceof Karyawan) {
                    userData += "Status : Karyawan\n";
                }
            }
            return userData;
        }
    }

    public int cekUserDataNimMhs(String nim) {
        for (int i = 0; i < listUser.size(); i++) {
            User temp = listUser.get(i);
            if (temp instanceof Mahasiswa) {
                Mahasiswa mhs = (Mahasiswa) temp;
                if (mhs.getNim().equals(nim)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int cekUserDataKodeMkMhs(ArrayList<MatkulAmbil> matkulAmbil, String kodeMK) {
        for (int i = 0; i < matkulAmbil.size(); i++) {
            MatkulAmbil temp = matkulAmbil.get(i);
            if (temp.getMatkulAmbil().getKode().equals(kodeMK)) {
                return (temp.getN1() + temp.getN2() + temp.getN3()) / 3;
            }
        }
        return -1;
    }

    public String printNilaiAkhir(String nim, String kodeMk) {
        int ketemu = cekUserDataNimMhs(nim);
        if (ketemu == -1) {
            return "Data tidak ditemukan";
        } else {
            User temp = listUser.get(ketemu);
            int nilai = 0;
            if (listUser.get(ketemu) instanceof MhsSarjana) {
                MhsSarjana mhs = (MhsSarjana) temp;
                nilai = cekUserDataKodeMkMhs(mhs.getListMatkul(), kodeMk);
            } else if (listUser.get(ketemu) instanceof MhsMagister) {
                MhsMagister mhs = (MhsMagister) temp;
                nilai = cekUserDataKodeMkMhs(mhs.getListMatkul(), kodeMk);
            } else if (listUser.get(ketemu) instanceof MhsDoktor) {
                MhsDoktor mhs = (MhsDoktor) temp;
                nilai = (mhs.getnSidang1() + mhs.getnSidang2() + mhs.getnSidang3()) / 3;
            }
            if (nilai == -1) {
                return "Data tidak ditemukan";
            }
            return "Nilai akhir : " + nilai;
        }
    }

    public String cekRataNilaiAkhir(int cek, String kodeMk) {
        int bnykNilai = 0;
        int totalNilai = 0;

        if (cek != -1) {
            totalNilai = +cek;
            bnykNilai++;
        } else {
            return "Tidak ada data dengan kode MK " + kodeMk;
        }
        return "Rata rata nilai dengan kode MK " + kodeMk + " adalah " + totalNilai / bnykNilai;
    }

    public String printRataNilaiAkhir(String kodeMk) {

        String hasil = "";
        for (int i = 0; i < listUser.size(); i++) {
            User temp = listUser.get(i);
            if (listUser.get(i) instanceof MhsMagister) {
                MhsMagister mhs = (MhsMagister) temp;
                int cek = cekUserDataKodeMkMhs(mhs.getListMatkul(), kodeMk);
                hasil = cekRataNilaiAkhir(cek, kodeMk);

            } else if (listUser.get(i) instanceof MhsSarjana) {
                MhsSarjana mhs = (MhsSarjana) temp;
                int cek = cekUserDataKodeMkMhs(mhs.getListMatkul(), kodeMk);
                hasil = cekRataNilaiAkhir(cek, kodeMk);
            }
        }
        return hasil;
    }

    public String cekBanyakMhsTdkLulus(int cek, String kodeMk) {
        int bnykMhs = 0;
        int totalMhs = 0;

        if (cek != -1) {
            totalMhs++;
            if (cek < 56) {
                bnykMhs++;
            }
        } else {
            return "Tidak ada data dengan kode MK " + kodeMk;
        }
        return bnykMhs + " dari " + totalMhs + " mahasiswa tidak lulus matakuliah " + kodeMk;
    }

    public String printBnykMhsTdkLulus(String kodeMk) {
        String hasil = "";
        for (int i = 0; i < listUser.size(); i++) {
            User temp = listUser.get(i);
            if (listUser.get(i) instanceof MhsMagister) {
                MhsMagister mhs = (MhsMagister) temp;
                int cek = cekUserDataKodeMkMhs(mhs.getListMatkul(), kodeMk);
                hasil = cekBanyakMhsTdkLulus(cek, kodeMk);
            } else if (listUser.get(i) instanceof MhsSarjana) {
                MhsSarjana mhs = (MhsSarjana) temp;
                int cek = cekUserDataKodeMkMhs(mhs.getListMatkul(), kodeMk);
                hasil = cekBanyakMhsTdkLulus(cek, kodeMk);
            }
        }
        return hasil;
    }

    public String printMatkulAmbil(String nim) {
        int ketemu = cekUserDataNimMhs(nim);
        String hasil = "";
        if (ketemu == -1) {
            return "Data tidak ditemukan";
        } else {
            User temp = listUser.get(ketemu);
            if (temp instanceof MhsSarjana) {
                MhsSarjana mhs = (MhsSarjana) temp;
                ArrayList<MatkulAmbil> mkAmbil = mhs.getListMatkul();
                for (int i = 0; i < mkAmbil.size(); i++) {
                    MatkulAmbil mk = mkAmbil.get(i);
                    hasil += mk.toString();
                }
            } else if (temp instanceof MhsMagister) {
                MhsMagister mhs = (MhsMagister) temp;
                ArrayList<MatkulAmbil> mkAmbil = mhs.getListMatkul();
                for (int i = 0; i < mkAmbil.size(); i++) {
                    MatkulAmbil mk = mkAmbil.get(i);
                    hasil += mk.toString();
                }
            }
        }
        return hasil;
    }

    public int cekStaffData(String nik) {
        for (int i = 0; i < listUser.size(); i++) {
            User temp = listUser.get(i);
            if (temp instanceof Staff) {
                Staff staff = (Staff) temp;
                if (staff.getNik().equals(nik)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int cekTotalJamDosen(ArrayList<PresensiStaff> p) {
        int totalJam = 0;
        for (int i = 0; i < p.size(); i++) {
            PresensiStaff presensi = p.get(i);
            if (presensi.getStatus() == HADIR) {
                totalJam += presensi.getJam();
            }
        }
        return totalJam;
    }

    public String printJamDosen(String nik) {
        int ketemu = cekStaffData(nik);
        if (ketemu == -1) {
            return "Data tidak ditemukan";
        } else {
            User temp = listUser.get(ketemu);
            if (temp instanceof Dosen) {
                Dosen dosen = (Dosen) temp;
                ArrayList<MatkulAjar> matkulAjar = dosen.getListMatkulAjar();
                int totalJam = 0;
                for (int i = 0; i < matkulAjar.size(); i++) {
                    MatkulAjar mkAjar = matkulAjar.get(i);
                    ArrayList<PresensiStaff> p = mkAjar.getPresensi();
                    totalJam += cekTotalJamDosen(p);
                }
                return "Total jam dosen mengajar : " + totalJam;
            }
        }
        return "Data tidak ditemukan";
    }

    public int cekKehadiran(ArrayList<PresensiStaff> p) {
        int hadir = 0;
        for (int i = 0; i < p.size(); i++) {
            PresensiStaff presensi = p.get(i);
            if (presensi.getStatus() == HADIR) {
                hadir++;
            }
        }
        return hadir;
    }

    public String printGaji(String nik) {
        int ketemu = cekStaffData(nik);
        double gaji = 0;
        int unit = 0;
        if (ketemu == -1) {
            return "Data tidak ditemukan";
        } else {
            User temp = listUser.get(ketemu);
            if (temp instanceof Karyawan) {
                Karyawan karyawan = (Karyawan) temp;
                ArrayList<PresensiStaff> p = karyawan.getListPresensiStaff();
                unit = cekKehadiran(p);
                gaji = unit / 22 * karyawan.getSalary();
            }else if (temp instanceof DosenTetap) {
                DosenTetap dosenTetap = (DosenTetap) temp;
                ArrayList<MatkulAjar> matkulAjar = dosenTetap.getListMatkulAjar();
                for (int i = 0; i < matkulAjar.size(); i++) {
                    MatkulAjar mkAjar = matkulAjar.get(i);
                    ArrayList<PresensiStaff> p = mkAjar.getPresensi();
                    unit += cekKehadiran(p);
                }
                gaji = dosenTetap.getSalary() + (unit * 25000);
            }else if (temp instanceof DosenHonorer) {
                DosenHonorer dosenHonorer = (DosenHonorer) temp;
                ArrayList<MatkulAjar> matkulAjar = dosenHonorer.getListMatkulAjar();
                for (int i = 0; i < matkulAjar.size(); i++) {
                    MatkulAjar mkAjar = matkulAjar.get(i);
                    ArrayList<PresensiStaff> p = mkAjar.getPresensi();
                    unit += cekKehadiran(p);
                }
                gaji = unit * dosenHonorer.getHonorPerSKS();
            }
            return "Total Gaji : " + gaji;
        }
    }
}
