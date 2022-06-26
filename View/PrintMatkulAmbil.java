package View;
import javax.swing.JOptionPane;
import Controller.Controller;

public class PrintMatkulAmbil {
    public PrintMatkulAmbil(){
        Controller controller = new Controller();
        String nim = JOptionPane.showInputDialog(null, "Input Nim : ");
        JOptionPane.showMessageDialog(null, controller.printMatkulAmbil(nim));
    }
}
