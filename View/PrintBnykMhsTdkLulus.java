package View;
import javax.swing.JOptionPane;
import Controller.Controller;

public class PrintBnykMhsTdkLulus {
    public PrintBnykMhsTdkLulus(){
        Controller controller = new Controller();
        String kodeMk = JOptionPane.showInputDialog("Input Kode Mata Kuliah : ");
        JOptionPane.showMessageDialog(null, controller.printBnykMhsTdkLulus(kodeMk));
    }
}
