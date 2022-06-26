package View;
import javax.swing.JOptionPane;
import Controller.Controller;

public class PrintNilaiAkhir {
    public PrintNilaiAkhir(){
        Controller controller = new Controller();

        String nim = JOptionPane.showInputDialog("Input Nim : ");
        String kodeMk = JOptionPane.showInputDialog("Input Kode Mata Kuliah : ");

        JOptionPane.showMessageDialog(null, controller.printNilaiAkhir(nim, kodeMk));
    }
}
