package View;
import javax.swing.JOptionPane;
import Controller.Controller;

public class PrintRataNilaiAkhir {
    public PrintRataNilaiAkhir(){
        Controller controller = new Controller();
        String kodeMk = JOptionPane.showInputDialog(null, "Input Kode MK : ");

        JOptionPane.showMessageDialog(null, controller.printRataNilaiAkhir(kodeMk));

    }
}
