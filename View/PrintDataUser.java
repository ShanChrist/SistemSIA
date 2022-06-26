package View;
import javax.swing.JOptionPane;
import Controller.Controller;

public class PrintDataUser {
    public PrintDataUser(){
        Controller controller = new Controller();

        String nama = JOptionPane.showInputDialog("Input Nama : ");

        JOptionPane.showMessageDialog(null, controller.printUserData(nama));
    }
}
