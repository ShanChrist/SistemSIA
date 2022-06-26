package View;
import javax.swing.JOptionPane;

public class Menu {
    public Menu() {
        showMenu();
    }

    public void showMenu() {
        Boolean menu = true;
        while(menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: \n1.Print User Data \n2.Print Nilai Akhir \n3.Print Rata-Rata nilai Akhir \n4.Print Mahasiswa Tdk Lulus \n5.Print Matkul Mahasiswa\n6.Print total jam ajar\n7.Print Gaji\n8.Exit"));
            switch(choosen) {
                case 1: new PrintDataUser();
                    break;
                case 2: new PrintNilaiAkhir();
                    break;
                case 3: new PrintRataNilaiAkhir();
                    break;
                case 4: new PrintBnykMhsTdkLulus();
                    break;
                case 5: new PrintMatkulAmbil();
                    break;
                case 6: new PrintJamDosen();
                    break;
                case 7: new PrintGaji();
                    break;
                case 8:menu = false;
                    break;
            }
        }
    }
}
