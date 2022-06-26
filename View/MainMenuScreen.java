package View;
import javax.swing.JOptionPane;
public class MainMenuScreen {
    public MainMenuScreen() {
        showMainMenu();
    }

    public void showMainMenu(){
        Boolean menu = true;
        while(menu){
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Pilih Menu: \n"
            + "1. Mahasiswa \n"
            + "2. Staff \n"
            + "3. Exit \n"));

            switch(choosen){
                case 1: new Menu();
                break;
                case 2: new Menu();
                break;
                case 3: menu = false;
                break;
                default: JOptionPane.showMessageDialog(null, "Pilihan tidak ada");
            }
        }
    }
}
