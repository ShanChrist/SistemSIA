package View;

import javax.swing.JOptionPane;
import Controller.Controller;

public class PrintJamDosen {
    public PrintJamDosen() {
        Controller controller = new Controller();
        String nik = JOptionPane.showInputDialog(null, "Input NIK : ");
        JOptionPane.showMessageDialog(null, controller.printJamDosen(nik));
    }
}
